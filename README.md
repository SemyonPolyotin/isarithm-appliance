# Isarithm Appliance
Appliance Java Spring REST web service for Isarithm

## Installation
```bash
    $ git clone https://github.com/semyonpolyotin/isarithm-appliance.git
    $ cd isarithm-appliance
    $ gradle bootJar
    $ scp ./build/libs/isarithm-appliance.jar isarithm@vds1.isarithm.ru:/var/www/isarithm/isarithm-appliance.jar
    $ ssh -f isarithm@vds1.isarithm.ru 'nohup java -Dserver.port=4005 -jar /var/www/isarithm/isarithm-appliance.jar --spring.profiles.active=prod >/dev/null 2>&1 &'
```

## Restart
```fish
    ssh -f isarithm@vds1.isarithm.ru 'kill -15 (ps aux | grep 'isarithm-appliance.jar' | grep -v grep | awk \'{print $2}\')'
```
