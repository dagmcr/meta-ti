SUMMARY = "TI RTOS low level driver for Telecom Serial Interface Port (TSIP)"

inherit ti-pdk

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://tsip.h;beginline=1;endline=32;md5=dab2257b0b8a3678c26915f6eb49b71e"

COMPATIBLE_MACHINE = "k2e|c667x-evm"
PACKAGE_ARCH = "${MACHINE_ARCH}"

TSIP_LLD_GIT_URI = "git://git.ti.com/keystone-rtos/tsip-lld.git"
TSIP_LLD_GIT_PROTOCOL = "git"
TSIP_LLD_GIT_BRANCH = "master"

# Below commit ID corresponds to "DEV.TSIP_LLD.01.00.00.08A"
TSIP_LLD_SRCREV = "368ff5fbd963f4b5d5c81bbfaf3daca23beb2a87"

BRANCH = "${TSIP_LLD_GIT_BRANCH}"
SRC_URI = "${TSIP_LLD_GIT_URI};protocol=${TSIP_LLD_GIT_PROTOCOL};branch=${BRANCH}"

SRCREV = "${TSIP_LLD_SRCREV}"
PV = "01.00.00.08A"
PR = "r0"

# HTML doc link params
PDK_COMP_LINK_TEXT = "TSIP LLD"
