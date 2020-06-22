DESCRIPTION = "Arcade emu - Final Burn Alpha (0.2.97.30) port for libretro"

LICENSE = "FB-ALPHA"
LIC_FILES_CHKSUM = "file://src/license.txt;md5=fb136c22aaaf9c6b9e72228ee036eac6"

inherit libretro/core/git

LIBRETRO_CORE = "fbalpha2012_neogeo"
LIBRETRO_GIT_REPO = "github.com/libretro/fbalpha2012_neogeo.git"

SECURITY_CFLAGS = ""