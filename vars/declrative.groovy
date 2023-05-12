def newDownload(repo)
{
  git "https://github.com/chaitu2729/${repo}"
}
def newBuild()
{
 sh "mvn package"  
}
def newDeployment(jobname,ip,context)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war"  
}
