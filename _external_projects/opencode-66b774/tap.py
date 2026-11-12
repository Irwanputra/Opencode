#!/usr/bin/env python3
"""Tap elemen berdasarkan content-desc / text via uiautomator dump.
Pakai: tap.py desc "Pakai payload" | tap.py text "OK" | tap.py bounds "[1,2][3,4]"
"""
import re, subprocess, sys, time

ADB = "/usr/local/lib/android/sdk/platform-tools/adb"

def dump():
    subprocess.run([ADB, "shell", "uiautomator", "dump", "/sdcard/w.xml"],
                   capture_output=True, timeout=60)
    out = subprocess.run([ADB, "shell", "cat", "/sdcard/w.xml"],
                         capture_output=True, text=True, timeout=60)
    return out.stdout

def find(xml, attr, value, exact=True):
    nodes = []
    for m in re.finditer(r'<node[^>]*>', xml):
        tag = m.group(0)
        a = re.search(rf'{attr}="([^"]*)"', tag)
        if not a:
            continue
        if (a.group(1) == value) if exact else (value in a.group(1)):
            b = re.search(r'bounds="\[(\d+),(\d+)\]\[(\d+),(\d+)\]"', tag)
            if b:
                nodes.append(tuple(int(x) for x in b.groups()))
    return nodes

def tap(x1, y1, x2, y2):
    x, y = (x1 + x2) // 2, (y1 + y2) // 2
    subprocess.run([ADB, "shell", "input", "tap", str(x), str(y)], timeout=30)

def main():
    mode, value = sys.argv[1], sys.argv[2]
    attr = "content-desc" if mode == "desc" else "text"
    exact = len(sys.argv) < 4 or sys.argv[3] != "contains"
    for attempt in range(5):
        nodes = find(dump(), attr, value, exact)
        if nodes:
            tap(*nodes[0])
            print(f"tapped {value} at {nodes[0]}")
            return 0
        time.sleep(1.5)
    print(f"NOT FOUND: {value}")
    return 1

if __name__ == "__main__":
    sys.exit(main())
