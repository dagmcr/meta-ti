require linux-ti-staging_4.19.bb

# Look in the generic major.minor directory for files
# This will have priority over generic non-rt path
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-4.19:"

BRANCH = "ti-rt-linux-4.19.y"

SRCREV = "23e34c8e14573f23de2e3da63411ef5cc0e0b0e7"
PV = "4.19.59+git${SRCPV}"
