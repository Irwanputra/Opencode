// 00102358 FUN_00102358

undefined8 FUN_00102358(uint *param_1,uint *param_2)

{
  ulong uVar1;
  uint uVar2;
  long lVar3;
  undefined8 ****local_178;
  undefined8 ****local_170;
  undefined1 auStack_168 [256];
  undefined1 auStack_68 [32];
  long local_48;
  
  lVar3 = tpidr_el0;
  local_170 = &local_178;
  local_48 = *(long *)(lVar3 + 0x28);
  local_178 = &local_170;
  uVar2 = param_1[8] >> 3 & 0x3f;
  if (uVar2 < 0x38) {
    memcpy((void *)((long)param_1 + (ulong)uVar2 + 0x28),&DAT_00100dd0,(ulong)(0x38 - uVar2));
  }
  else {
    memcpy((void *)((long)(param_1 + 10) + (ulong)uVar2),&DAT_00100dd0,(ulong)(0x40 - uVar2));
    FUN_00101920(param_1,param_1 + 10,auStack_168,auStack_68);
    param_1[0x16] = 0;
    param_1[0x17] = 0;
    param_1[0x14] = 0;
    param_1[0x15] = 0;
    param_1[0x12] = 0;
    param_1[0x13] = 0;
    param_1[0x10] = 0;
    param_1[0x11] = 0;
    param_1[0xe] = 0;
    param_1[0xf] = 0;
    param_1[0xc] = 0;
    param_1[0xd] = 0;
    param_1[10] = 0;
    param_1[0xb] = 0;
  }
  uVar1 = (*(ulong *)(param_1 + 8) & 0xff00ff00ff00ff00) >> 8 |
          (*(ulong *)(param_1 + 8) & 0xff00ff00ff00ff) << 8;
  uVar1 = (uVar1 & 0xffff0000ffff0000) >> 0x10 | (uVar1 & 0xffff0000ffff) << 0x10;
  *(ulong *)(param_1 + 0x18) = uVar1 >> 0x20 | uVar1 << 0x20;
  FUN_00101920(param_1,param_1 + 10,auStack_168,auStack_68);
  uVar2 = (*param_1 & 0xff00ff00) >> 8 | (*param_1 & 0xff00ff) << 8;
  *param_2 = uVar2 >> 0x10 | uVar2 << 0x10;
  uVar2 = (param_1[1] & 0xff00ff00) >> 8 | (param_1[1] & 0xff00ff) << 8;
  param_2[1] = uVar2 >> 0x10 | uVar2 << 0x10;
  uVar2 = (param_1[2] & 0xff00ff00) >> 8 | (param_1[2] & 0xff00ff) << 8;
  param_2[2] = uVar2 >> 0x10 | uVar2 << 0x10;
  uVar2 = (param_1[3] & 0xff00ff00) >> 8 | (param_1[3] & 0xff00ff) << 8;
  param_2[3] = uVar2 >> 0x10 | uVar2 << 0x10;
  uVar2 = (param_1[4] & 0xff00ff00) >> 8 | (param_1[4] & 0xff00ff) << 8;
  param_2[4] = uVar2 >> 0x10 | uVar2 << 0x10;
  uVar2 = (param_1[5] & 0xff00ff00) >> 8 | (param_1[5] & 0xff00ff) << 8;
  param_2[5] = uVar2 >> 0x10 | uVar2 << 0x10;
  uVar2 = (param_1[6] & 0xff00ff00) >> 8 | (param_1[6] & 0xff00ff) << 8;
  param_2[6] = uVar2 >> 0x10 | uVar2 << 0x10;
  uVar2 = (param_1[7] & 0xff00ff00) >> 8 | (param_1[7] & 0xff00ff) << 8;
  param_2[7] = uVar2 >> 0x10 | uVar2 << 0x10;
  FUN_001199a8(auStack_168,0x120);
  FUN_001199a8(param_1,0x68);
  if (*(long *)(lVar3 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return 0;
}


