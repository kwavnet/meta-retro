LINUX_VERSION ?= "5.4.72"
LINUX_RPI_BRANCH ?= "rpi-5.4.y"

SRCREV_machine = "154de7bbd5844a824a635d4f9e3f773c15c6ce11"
SRCREV_meta = "5d52d9eea95fa09d404053360c2351b2b91b323b"

require linux-raspberrypi_5.4.inc

SRC_URI += "file://0001-Revert-selftests-bpf-Skip-perf-hw-events-test-if-the.patch \
            file://0002-Revert-selftests-bpf-Fix-perf_buffer-test-on-systems.patch \
            file://powersave.cfg \
            file://android-drivers.cfg \
            file://rt.cfg \
            https://cdn.kernel.org/pub/linux/kernel/projects/rt/5.4/patch-5.4.70-rt40.patch.gz \
            "

SRC_URI[sha256sum] = "8aafe3db3f0056226f711dc0430318e8f7aac84fd4b0df1db11f72d81497e682"