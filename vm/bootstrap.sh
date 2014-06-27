##########################################################
# Install Maven3
# Download the current maven version from the prescribed repository:
# check the version, maybe a more recent version is available ...
wget http://www.eng.lsu.edu/mirrors/apache/maven/maven3/3.1.1/binaries/apache-maven-3.1.1-bin.tar.gz

# Extract the archive to the maven home directory: /usr/local/
cp apache-maven-3.1.1-bin.tar.gz /usr/local
rm apache-maven-3.1.1-bin.tar.gz
cd /usr/local
tar zxvf
apache-maven-3.1.1-bin.tar.gz

# Create a sym link..
ln s apache-maven-3.1.1-bin maven

# Define environment variables
echo 'export M2_HOME=/usr/local/apache-maven-3.1.1' >> /home/$USER/.bashrc
echo 'export PATH=${M2_HOME}/bin:${PATH}' >> /home/$USER/.bashrc

# Execute the environment changes with the command, ... and test mvn
source /home/$USER/.bashrc
chmod 777 /usr/local/apache-maven-3.1.1/bin/mvn
/usr/local/apache-maven-3.1.1/bin/mvn version

# Build the current version of CumulusRDF and load all maven artefacts
cd /home/cumulus/cumulus-rdf-readonly
/usr/local/apache-maven-3.1.1/bin/mvn -DskipTests clean compile package cassandra:stop cassandra:start tomcat7:run