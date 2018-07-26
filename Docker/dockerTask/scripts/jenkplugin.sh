#включаем отображение ошибок
set -ex

echo "качаем jenkins-cli для дальнейшей работы"
sleep 2s   
#качаем jenkins-cli для дальнейшей работы
wget http://localhost:8080/jnlpJars/jenkins-cli.jar -O /root/jenkins-cli.jar #&& chmod a+x /root/jenkins-cli.jar


echo "авторизуемся как админ"
sleep 2s   
#авторизуемся как админ
java -jar /root/jenkins-cli.jar -auth admin:$(cat /root/.jenkins/secrets/initialAdminPassword) -s http://localhost:8080/


echo "скачиваем плагин"
sleep 2s   
#скачиваем плагин 
java -jar /root/jenkins-cli.jar -auth admin:$(cat /root/.jenkins/secrets/initialAdminPassword) -s http://localhost:8080 install-plugin job-dsl


echo "перезапускаем jenkins"
sleep 2s   
#перезапускаем jenkins
java -jar /root/jenkins-cli.jar -auth admin:$(cat /root/.jenkins/secrets/initialAdminPassword) -s http://localhost:8080 safe-restart 

