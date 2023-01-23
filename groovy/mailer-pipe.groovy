node {
    // some block
stage('download') {
git 'https://github.com/sunildevops77/maven.git' 
sh 'echo "printing build tool ============~~~~~~~~~~~~+++++++++++"'
input '"Waiting for devops approval"'

}
stage ('test') {
sh 'echo "Testing -qa "'
step([$class: 'Mailer', notifyEveryUnstableBuild: true, recipients: 'rpatil@aurusinc.com', sendToIndividuals: false])
}
}



step([$class: 'Mailer', notifyEveryUnstableBuild: true, recipients: 'rpatil@aurusinc.com', sendToIndividuals: false])