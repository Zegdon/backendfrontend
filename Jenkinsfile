
//SCRIPTED




//DECLARATIVE

pipeline {
       agent any

      environment{
      registry = "csabaazari/"
      dockerHome = tool 'myDocker'
      registryCredential = 'dockerlogin'
      mavenHome = tool 'myMaven'
      PATH = "$dockerHome/bin:$mavenHome/bin:$PATH"

      }



        stages {
            stage('Checkout') {
                steps {
                       sh 'mvn --version'
                       sh 'docker --version'
		       sh 'ls'

                      echo "Build"
                      echo "PATH - $PATH"
                      echo "BUILD_NUMBER - $env.BUILD_NUMBER"
                      echo "BUILD_ID - $env.BUILD_ID"
                      echo "JOB_NAME - $env.JOB_NAME"
                      echo "BUILD_TAG - $env.BUILD_TAG"
                      echo "BUILD_URL - $env.BUILD_URL"
                }
            }


						stage('Package'){
                            steps {
                                sh "mvn clean package"
                             }

                        }

                        stage('Docker Compose Build') {
                            steps {
                            sh "docker-compose build"
                            sh "docker images"
                            }

                        }


//                         stage('push dockerimage'){
//                         steps{
//                         script{
//                             docker.withRegistry('https://hub.docker.com/','dockerlogin'){
//
//                           //  dockerImage.push('csabaazari/user-service:latest');
//                           //  dockerImage.push('latest');
//                             }
//                         }
//                     }
//                }

                        stage('Docker pu12s1h') {
                            steps {
                            sh 'docker login -u csabaazari -p 56ffa358-3d14-48e1-a7c8-aa24bdb19a37'
                            sh "docker push csabaazari/user-service:latest"
                            sh "docker push csabaazari/config-service:latest"
                            sh "docker push csabaazari/discovery-service-peer1:latest"
                            sh "docker push csabaazari/discovery-service-peer2:latest"
                            sh "docker push csabaazari/gateway-service:latest"
                            sh "docker push csabaazari/email-service:latest"
                            sh "docker push csabaazari/task-service:latest"
                            sh "docker push csabaazari/course-service:latest"
                            sh "docker push csabaazari/filemanagement-service:latest"
                            sh "docker push csabaazari/feedback-service:latest"

                            }

                        }
      }
      post {
            always {
                echo 'Im awsome. I run always'
            }
            success {
                echo 'I run when you are succesful'
            }
            failure {
                 echo 'I run when you fail'
            }
      }

}

