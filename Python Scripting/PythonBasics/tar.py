import tarfile
import glob


def create_tarfile():
    trfile = tarfile.open("mytarfile.tar", "w")
    for configfile in glob.glob("/ect/*.conf"):
        trfile.add(configfile)
    trfile.close()


create_tarfile()

