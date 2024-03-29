SUMMARY = "Cadence MHDP DP bridge firmware"

LICENSE = "BSD-3-Clause | Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENCE.cadence;md5=009f46816f6956cfb75ede13d3e1cee0"

PV = "1.2.15"
PR = "r0"

CLEANBROKEN = "1"

COMPATIBLE_MACHINE = "j7-evm"

PACKAGE_ARCH = "${MACHINE_ARCH}"

SRCREV = "3930363562b35a5f3d495a61ea7e51739462b14a"
BRANCH ?= "ti-linux-firmware"

SRC_URI = "git://git.ti.com/processor-firmware/ti-linux-firmware.git;protocol=git;branch=${BRANCH}"

S = "${WORKDIR}/git"
TARGET = "mhdp8546.bin"

do_install() {
	install -d ${D}${base_libdir}/firmware/cadence
	install -m 0644 ${S}/cadence/${TARGET} ${D}${base_libdir}/firmware/cadence/${TARGET}
}

FILES_${PN} = "${base_libdir}/firmware"
