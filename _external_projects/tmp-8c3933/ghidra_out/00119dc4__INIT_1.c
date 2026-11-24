// 00119dc4 _INIT_1

void _INIT_1(void)

{
  uint uVar1;
  int iVar2;
  char acStack_6c [92];
  
  uVar1 = getauxval(0x10);
  if ((uVar1 >> 8 & 1) == 0) {
    DAT_00122698 = 0;
    return;
  }
  iVar2 = __system_property_get("ro.arch",acStack_6c);
  if (iVar2 < 1) {
    DAT_00122698 = 1;
    return;
  }
  iVar2 = strncmp(acStack_6c,"exynos9810",10);
  DAT_00122698 = iVar2 != 0;
  return;
}


