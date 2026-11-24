// 00119e5c FUN_00119e5c

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00119e5c(ulong param_1,long param_2)

{
  ulong uVar1;
  ulong uVar2;
  undefined1 auVar3 [16];
  undefined1 auVar4 [16];
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  
  if ((param_1 >> 0x3e & 1) == 0) {
    uVar1 = 0;
  }
  else {
    uVar1 = *(ulong *)(param_2 + 0x10);
  }
  auVar8._8_8_ = uVar1;
  auVar8._0_8_ = uVar1;
  auVar3._8_8_ = _UNK_00100f18;
  auVar3._0_8_ = _DAT_00100f10;
  auVar5._8_8_ = _UNK_00100e78;
  auVar5._0_8_ = _DAT_00100e70;
  auVar7._8_8_ = _UNK_00100ea8;
  auVar7._0_8_ = _DAT_00100ea0;
  auVar9 = NEON_ushl(auVar8,auVar3,8);
  auVar5 = NEON_ushl(auVar8,auVar5,8);
  auVar3 = NEON_ushl(auVar8,auVar7,8);
  auVar4[8] = (char)_UNK_00100dd8;
  auVar4._0_8_ = _DAT_00100dd0;
  auVar4[9] = (char)((ulong)_UNK_00100dd8 >> 8);
  auVar4[10] = (char)((ulong)_UNK_00100dd8 >> 0x10);
  auVar4[0xb] = (char)((ulong)_UNK_00100dd8 >> 0x18);
  auVar4[0xc] = (char)((ulong)_UNK_00100dd8 >> 0x20);
  auVar4[0xd] = (char)((ulong)_UNK_00100dd8 >> 0x28);
  auVar4[0xe] = (char)((ulong)_UNK_00100dd8 >> 0x30);
  auVar4[0xf] = (char)((ulong)_UNK_00100dd8 >> 0x38);
  auVar4 = NEON_ushl(auVar8,auVar4,8);
  auVar6[0] = auVar3[0] & (byte)_DAT_00100f20 | auVar4[0] & (byte)_DAT_00100e10 |
              auVar9[0] & (byte)_DAT_00100df0 | auVar5[0] & (byte)_DAT_00100de0;
  auVar6[1] = auVar3[1] & (byte)((ulong)_DAT_00100f20 >> 8) |
              auVar4[1] & (byte)((ulong)_DAT_00100e10 >> 8) |
              auVar9[1] & (byte)((ulong)_DAT_00100df0 >> 8) |
              auVar5[1] & (byte)((ulong)_DAT_00100de0 >> 8);
  auVar6[2] = auVar3[2] & (byte)((ulong)_DAT_00100f20 >> 0x10) |
              auVar4[2] & (byte)((ulong)_DAT_00100e10 >> 0x10) |
              auVar9[2] & (byte)((ulong)_DAT_00100df0 >> 0x10) |
              auVar5[2] & (byte)((ulong)_DAT_00100de0 >> 0x10);
  auVar6[3] = auVar3[3] & (byte)((ulong)_DAT_00100f20 >> 0x18) |
              auVar4[3] & (byte)((ulong)_DAT_00100e10 >> 0x18) |
              auVar9[3] & (byte)((ulong)_DAT_00100df0 >> 0x18) |
              auVar5[3] & (byte)((ulong)_DAT_00100de0 >> 0x18);
  auVar6[4] = auVar3[4] & (byte)((ulong)_DAT_00100f20 >> 0x20) |
              auVar4[4] & (byte)((ulong)_DAT_00100e10 >> 0x20) |
              auVar9[4] & (byte)((ulong)_DAT_00100df0 >> 0x20) |
              auVar5[4] & (byte)((ulong)_DAT_00100de0 >> 0x20);
  auVar6[5] = auVar3[5] & (byte)((ulong)_DAT_00100f20 >> 0x28) |
              auVar4[5] & (byte)((ulong)_DAT_00100e10 >> 0x28) |
              auVar9[5] & (byte)((ulong)_DAT_00100df0 >> 0x28) |
              auVar5[5] & (byte)((ulong)_DAT_00100de0 >> 0x28);
  auVar6[6] = auVar3[6] & (byte)((ulong)_DAT_00100f20 >> 0x30) |
              auVar4[6] & (byte)((ulong)_DAT_00100e10 >> 0x30) |
              auVar9[6] & (byte)((ulong)_DAT_00100df0 >> 0x30) |
              auVar5[6] & (byte)((ulong)_DAT_00100de0 >> 0x30);
  auVar6[7] = auVar3[7] & (byte)((ulong)_DAT_00100f20 >> 0x38) |
              auVar4[7] & (byte)((ulong)_DAT_00100e10 >> 0x38) |
              auVar9[7] & (byte)((ulong)_DAT_00100df0 >> 0x38) |
              auVar5[7] & (byte)((ulong)_DAT_00100de0 >> 0x38);
  auVar6[8] = auVar3[8] & (byte)_UNK_00100f28 | auVar4[8] & (byte)_UNK_00100e18 |
              auVar9[8] & (byte)_UNK_00100df8 | auVar5[8] & (byte)_UNK_00100de8;
  auVar6[9] = auVar3[9] & (byte)((ulong)_UNK_00100f28 >> 8) |
              auVar4[9] & (byte)((ulong)_UNK_00100e18 >> 8) |
              auVar9[9] & (byte)((ulong)_UNK_00100df8 >> 8) |
              auVar5[9] & (byte)((ulong)_UNK_00100de8 >> 8);
  auVar6[10] = auVar3[10] & (byte)((ulong)_UNK_00100f28 >> 0x10) |
               auVar4[10] & (byte)((ulong)_UNK_00100e18 >> 0x10) |
               auVar9[10] & (byte)((ulong)_UNK_00100df8 >> 0x10) |
               auVar5[10] & (byte)((ulong)_UNK_00100de8 >> 0x10);
  auVar6[0xb] = auVar3[0xb] & (byte)((ulong)_UNK_00100f28 >> 0x18) |
                auVar4[0xb] & (byte)((ulong)_UNK_00100e18 >> 0x18) |
                auVar9[0xb] & (byte)((ulong)_UNK_00100df8 >> 0x18) |
                auVar5[0xb] & (byte)((ulong)_UNK_00100de8 >> 0x18);
  auVar6[0xc] = auVar3[0xc] & (byte)((ulong)_UNK_00100f28 >> 0x20) |
                auVar4[0xc] & (byte)((ulong)_UNK_00100e18 >> 0x20) |
                auVar9[0xc] & (byte)((ulong)_UNK_00100df8 >> 0x20) |
                auVar5[0xc] & (byte)((ulong)_UNK_00100de8 >> 0x20);
  auVar6[0xd] = auVar3[0xd] & (byte)((ulong)_UNK_00100f28 >> 0x28) |
                auVar4[0xd] & (byte)((ulong)_UNK_00100e18 >> 0x28) |
                auVar9[0xd] & (byte)((ulong)_UNK_00100df8 >> 0x28) |
                auVar5[0xd] & (byte)((ulong)_UNK_00100de8 >> 0x28);
  auVar6[0xe] = auVar3[0xe] & (byte)((ulong)_UNK_00100f28 >> 0x30) |
                auVar4[0xe] & (byte)((ulong)_UNK_00100e18 >> 0x30) |
                auVar9[0xe] & (byte)((ulong)_UNK_00100df8 >> 0x30) |
                auVar5[0xe] & (byte)((ulong)_UNK_00100de8 >> 0x30);
  auVar6[0xf] = auVar3[0xf] & (byte)((ulong)_UNK_00100f28 >> 0x38) |
                auVar4[0xf] & (byte)((ulong)_UNK_00100e18 >> 0x38) |
                auVar9[0xf] & (byte)((ulong)_UNK_00100df8 >> 0x38) |
                auVar5[0xf] & (byte)((ulong)_UNK_00100de8 >> 0x38);
  auVar8 = NEON_ext(auVar6,auVar6,8,1);
  uVar2 = CONCAT17(auVar6[7] | auVar8[7],
                   CONCAT16(auVar6[6] | auVar8[6],
                            CONCAT15(auVar6[5] | auVar8[5],
                                     CONCAT14(auVar6[4] | auVar8[4],
                                              CONCAT13(auVar6[3] | auVar8[3],
                                                       CONCAT12(auVar6[2] | auVar8[2],
                                                                CONCAT11(auVar6[1] | auVar8[1],
                                                                         auVar6[0] | auVar8[0]))))))
                  ) | (param_1 & 0x80) << 3 |
          param_1 >> 0x1a & 2 | (param_1 >> 4 & 1) << 0xf |
          param_1 >> 0xe & 0x20 | param_1 >> 0x10 & 0x10 |
          param_1 >> 0x14 & 8 | (param_1 >> 9 & 1) << 0x10 |
          param_1 >> 7 & 0x20000 | param_1 >> 6 & 0x40 |
          param_1 << 7 & 0x300000 | (param_1 >> 6 & 1) << 0xc |
          (param_1 & 0x10000000) << 0x15 | (param_1 >> 0x1d & 1) << 0x2e |
          param_1 >> 1 & 0x80 | uVar1 >> 5 & 4 |
          uVar1 << 0x23 & 0x3c000000000 | (uVar1 >> 0x12 & 1) << 0x2c |
          auVar4._0_8_ & 0x80000 | uVar1 >> 0x10 & 1 |
          auVar3._0_8_ & 0x800000000000000 | (uVar1 >> 0xd & 1) << 0x1a;
  if ((param_1 & 1) != 0) {
    uVar2 = uVar2 | 0x300;
  }
  DAT_001226a0 = (param_1 >> 0x16 & 1) << 0x1e | (uVar1 >> 0x2e & 1) << 0x3a |
                 param_1 << 7 & 0x400000 | (param_1 >> 0x10 & 1) << 0x12 | param_1 >> 3 & 0x800000 |
                 param_1 >> 4 & 0x2000 | (uVar1 >> 0xe & 1) << 0x1b | uVar1 << 0x23 & 0x1000000000 |
                 uVar2 | 0x8000000000000000;
  return;
}


