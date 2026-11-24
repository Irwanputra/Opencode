#!/bin/bash
export LD_LIBRARY_PATH=/tmp/qdeps/usr/lib/x86_64-linux-gnu
IMG=/usr/local/lib/android/sdk/system-images/android-34/google_apis/arm64-v8a
exec /tmp/qpkg/usr/bin/qemu-system-aarch64 \
  -L /tmp/qipxe/usr/share/qemu -M virt -cpu max -smp 4 -m 2048 \
  -dtb /tmp/virt.dtb -kernel $IMG/kernel-ranchu -initrd $IMG/ramdisk.img \
  -append "console=ttyAMA0,115200 console=tty0 earlycon=uart8250,mmio32,0x09000000 ignore_loglevel androidboot.hardware=ranchu androidboot.selinux=permissive androidboot.verifiedbootstate=orange" \
  -drive file=$IMG/system.img,format=raw,if=none,id=sys -device virtio-blk-device,drive=sys \
  -drive file=$IMG/vendor.img,format=raw,if=none,id=ven -device virtio-blk-device,drive=ven \
  -drive file=/tmp/userdata815.img,format=raw,if=none,id=usr -device virtio-blk-device,drive=usr \
  -netdev user,id=net0,hostfwd=tcp::5570-:5555 -device virtio-net-device,netdev=net0 \
  -display none -serial telnet:127.0.0.1:4445,server -monitor tcp:127.0.0.1:4556,server=on
