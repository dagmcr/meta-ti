DESCRIPTION = "TI Inter Process Communication (IPC) Mechanisms (for Uni- and Multi- Processor Configurations)"
HOMEPAGE="http://processors.wiki.ti.com/index.php/Category:IPC"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://${S}/ipc-linux.mak;beginline=1;endline=30;md5=7b327f9b710fd7c95e545b91cec79255"

TI_IPC_GIT_URI = "git://git.ti.com/ipc/ipcdev.git"
TI_IPC_GIT_PROTOCOL = "git"
TI_IPC_GIT_BRANCH = "3.50"

#Corresponds to 3.50.04.06
TI_IPC_SRCREV = "ca7ce99b8ec82331559f0fd99a174bdcca1da9ac"

BRANCH = "${TI_IPC_GIT_BRANCH}"
SRC_URI = "${TI_IPC_GIT_URI};protocol=${TI_IPC_GIT_PROTOCOL};branch=${BRANCH};name=ipcdev"
SRCREV = "${TI_IPC_SRCREV}"

S = "${WORKDIR}/git"
