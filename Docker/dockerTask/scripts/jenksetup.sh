#включаем отображение ошибок
#set -ex

#качаем jenkins с оффициального сайта
wget -P /root/ http://mirrors.jenkins.io/war-stable/2.121.2/jenkins.war

echo "запускаем jenkins" 
sleep 2s   
#запускаем jenkins
nohup java -jar /root/jenkins.war &


