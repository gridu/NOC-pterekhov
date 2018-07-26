#включаем отображение ошибок
set -ex

# запускаем jenksetup

nohup /root/jenksetup.sh &
status=$?
if [ $status -ne 0 ]; then
  echo "Не удалось запусить jenksetup: $status"
  exit $status
fi

while ! curl localhost:8080; do sleep 66; done

if curl localhost:8080; then
	# запускаем jenkplugin
	nohup /root/jenkplugin.sh 
	status=$?
	if [ $status -ne 0 ]; then
	  echo "Не удалось запусить jenkplugin: $status"
	  exit $status
	fi
fi






