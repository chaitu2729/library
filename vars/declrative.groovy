def newDownload(repo)
{
  git "https://github.com/chaitu2729/${repo}"
}
def newBuild()
{
 sh "mvn package"  
}
