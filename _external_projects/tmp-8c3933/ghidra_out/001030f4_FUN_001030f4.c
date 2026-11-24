// 001030f4 FUN_001030f4

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_001030f4(undefined8 param_1)

{
  long lVar1;
  undefined1 **local_a0;
  undefined1 *local_98;
  undefined8 local_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 local_70;
  long local_28;
  
  local_98 = (undefined1 *)&local_a0;
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  local_a0 = &local_98;
  local_70 = 0;
  uStack_88 = _UNK_00100f68;
  local_90 = _DAT_00100f60;
  uStack_78 = _UNK_00100f78;
  uStack_80 = _DAT_00100f70;
  FUN_00102508(&local_90);
  FUN_00102b70(&local_90,param_1);
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return 0;
}


