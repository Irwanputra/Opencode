// 001040c4 FUN_001040c4

void FUN_001040c4(void)

{
  code *UNRECOVERED_JUMPTABLE;
  code *pcVar1;
  uint uVar2;
  int iVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  undefined8 uVar9;
  uint uVar10;
  
  uVar9 = tpidr_el0;
  uVar2 = (byte)*PTR_JNI_OnLoad_0011f7f0 + 0x42855d4d ^ 0x286ba1fc;
  uVar5 = uVar2 >> 0x1b | uVar2 << 5;
  uVar2 = LAB_001031c4 + 0xb7d18121 ^ 0xa5edf4e;
  uVar10 = uVar5 * -0x7a143595;
  uVar6 = uVar2 >> 0x1b | uVar2 << 5;
  uVar7 = ((byte)FUN_001199a8 + 0x1e8abd4 ^ 0xb6dac018) << 5 | 0x16;
  uVar2 = uVar6 * -0x7a143595;
  uVar4 = uVar7 * -0x7a143595;
  uVar10 = uVar10 ^ (byte)PTR_JNI_OnLoad_0011f7f0[1] + 0x194f5ce7 +
                    uVar5 * 0x7af29ac0 + (uVar10 >> 2);
  uVar5 = uVar10 >> 0x1a | uVar10 << 6;
  uVar2 = uVar2 ^ LAB_001031c4_1 + 0x194f5ce7 + uVar6 * 0x7af29ac0 + (uVar2 >> 2);
  uVar10 = uVar5 * -0x7a143595;
  uVar4 = uVar4 ^ FUN_001199a8 + 0x194f5ce7 + uVar7 * 0x7af29ac0 + (uVar4 >> 2);
  uVar6 = uVar2 >> 0x1a | uVar2 << 6;
  uVar7 = uVar4 >> 0x1a | uVar4 << 6;
  uVar2 = uVar6 * -0x7a143595;
  uVar4 = uVar7 * -0x7a143595;
  uVar10 = uVar10 ^ (byte)PTR_JNI_OnLoad_0011f7f0[2] + 0x1628bc1c +
                    uVar5 * 0x7af29ac0 + (uVar10 >> 2);
  uVar5 = uVar10 >> 0x19 | uVar10 << 7;
  uVar2 = uVar2 ^ LAB_001031c4_2 + 0x1628bc1c + uVar6 * 0x7af29ac0 + (uVar2 >> 2);
  uVar10 = uVar5 * -0x7a143595;
  uVar4 = uVar4 ^ FUN_001199a8 + 0x1628bc1c + uVar7 * 0x7af29ac0 + (uVar4 >> 2);
  uVar6 = uVar2 >> 0x19 | uVar2 << 7;
  uVar7 = uVar4 >> 0x19 | uVar4 << 7;
  uVar2 = uVar6 * -0x7a143595;
  uVar4 = uVar7 * -0x7a143595;
  uVar10 = uVar10 ^ (byte)PTR_JNI_OnLoad_0011f7f0[3] + 0x108a1b5d +
                    uVar5 * 0x7af29ac0 + (uVar10 >> 2);
  uVar5 = uVar10 >> 0x18 | uVar10 << 8;
  uVar2 = uVar2 ^ LAB_001031c4_3 + 0x108a1b5d + uVar6 * 0x7af29ac0 + (uVar2 >> 2);
  uVar10 = uVar5 * -0x7a143595;
  uVar4 = uVar4 ^ FUN_001199a8 + 0x108a1b5d + uVar7 * 0x7af29ac0 + (uVar4 >> 2);
  uVar6 = uVar2 >> 0x18 | uVar2 << 8;
  uVar7 = uVar4 >> 0x18 | uVar4 << 8;
  uVar2 = uVar6 * -0x7a143595;
  uVar4 = uVar7 * -0x7a143595;
  uVar10 = uVar10 ^ (byte)PTR_JNI_OnLoad_0011f7f0[4] + 0xc737ab2 +
                    uVar5 * 0x7af29ac0 + (uVar10 >> 2);
  uVar5 = uVar10 >> 0x17 | uVar10 << 9;
  uVar2 = uVar2 ^ LAB_001031c8 + 0xc737ab2 + uVar6 * 0x7af29ac0 + (uVar2 >> 2);
  uVar10 = uVar5 * -0x7a143595;
  uVar4 = uVar4 ^ FUN_001199a8 + 0xc737ab2 + uVar7 * 0x7af29ac0 + (uVar4 >> 2);
  uVar6 = uVar2 >> 0x17 | uVar2 << 9;
  uVar7 = uVar4 >> 0x17 | uVar4 << 9;
  uVar2 = uVar6 * -0x7a143595;
  uVar4 = uVar7 * -0x7a143595;
  uVar10 = uVar10 ^ (byte)PTR_JNI_OnLoad_0011f7f0[5] + 0x8d5d9eb +
                    uVar5 * 0x7af29ac0 + (uVar10 >> 2);
  uVar5 = uVar10 >> 0x16 | uVar10 << 10;
  uVar2 = uVar2 ^ LAB_001031c8_1 + 0x8d5d9eb + uVar6 * 0x7af29ac0 + (uVar2 >> 2);
  uVar10 = uVar5 * -0x7a143595;
  uVar6 = uVar2 >> 0x16 | uVar2 << 10;
  uVar4 = uVar4 ^ FUN_001199a8 + 0x8d5d9eb + uVar7 * 0x7af29ac0 + (uVar4 >> 2);
  uVar7 = uVar4 >> 0x16 | uVar4 << 10;
  uVar2 = uVar6 * -0x7a143595;
  uVar4 = uVar7 * -0x7a143595;
  uVar10 = uVar10 ^ (byte)PTR_JNI_OnLoad_0011f7f0[6] + 0x3b34130 +
                    uVar5 * 0x7af29ac0 + (uVar10 >> 2);
  uVar5 = uVar10 >> 0x15 | uVar10 << 0xb;
  uVar2 = uVar2 ^ LAB_001031c8_2 + 0x3b34130 + uVar6 * 0x7af29ac0 + (uVar2 >> 2);
  uVar10 = uVar5 * -0x7a143595;
  uVar6 = uVar2 >> 0x15 | uVar2 << 0xb;
  uVar4 = uVar4 ^ FUN_001199a8 + 0x3b34130 + uVar7 * 0x7af29ac0 + (uVar4 >> 2);
  uVar7 = uVar4 >> 0x15 | uVar4 << 0xb;
  uVar2 = uVar6 * -0x7a143595;
  uVar4 = uVar7 * -0x7a143595;
  uVar10 = uVar10 ^ ((byte)PTR_JNI_OnLoad_0011f7f0[7] - 0x35fbf) +
                    uVar5 * 0x7af29ac0 + (uVar10 >> 2);
  uVar5 = uVar10 >> 0x14 | uVar10 << 0xc;
  uVar2 = uVar2 ^ (LAB_001031c8_3 - 0x35fbf) + uVar6 * 0x7af29ac0 + (uVar2 >> 2);
  uVar10 = uVar5 * -0x7a143595;
  uVar6 = uVar2 >> 0x14 | uVar2 << 0xc;
  uVar4 = uVar4 ^ (FUN_001199a8 - 0x35fbf) + uVar7 * 0x7af29ac0 + (uVar4 >> 2);
  uVar7 = uVar4 >> 0x14 | uVar4 << 0xc;
  uVar2 = uVar6 * -0x7a143595;
  uVar4 = uVar7 * -0x7a143595;
  uVar10 = uVar10 ^ (byte)PTR_JNI_OnLoad_0011f7f0[8] + 0xfbddff86 +
                    uVar5 * 0x7af29ac0 + (uVar10 >> 2);
  uVar5 = uVar10 >> 0x13 | uVar10 << 0xd;
  uVar2 = uVar2 ^ LAB_001031cc + 0xfbddff86 + uVar6 * 0x7af29ac0 + (uVar2 >> 2);
  uVar10 = uVar5 * -0x7a143595;
  uVar6 = uVar2 >> 0x13 | uVar2 << 0xd;
  uVar4 = uVar4 ^ bRam00000000001199b0 + 0xfbddff86 + uVar7 * 0x7af29ac0 + (uVar4 >> 2);
  uVar7 = uVar4 >> 0x13 | uVar4 << 0xd;
  uVar2 = uVar6 * -0x7a143595;
  uVar4 = uVar7 * -0x7a143595;
  uVar10 = uVar10 ^ (byte)PTR_JNI_OnLoad_0011f7f0[9] + 0xf6385ebf +
                    uVar5 * 0x7af29ac0 + (uVar10 >> 2);
  uVar5 = uVar10 >> 0x12 | uVar10 << 0xe;
  uVar2 = uVar2 ^ LAB_001031cc_1 + 0xf6385ebf + uVar6 * 0x7af29ac0 + (uVar2 >> 2);
  uVar10 = uVar5 * -0x7a143595;
  uVar6 = uVar2 >> 0x12 | uVar2 << 0xe;
  uVar4 = uVar4 ^ bRam00000000001199b1 + 0xf6385ebf + uVar7 * 0x7af29ac0 + (uVar4 >> 2);
  uVar7 = uVar4 >> 0x12 | uVar4 << 0xe;
  uVar2 = uVar6 * -0x7a143595;
  uVar4 = uVar7 * -0x7a143595;
  uVar10 = uVar10 ^ (byte)PTR_JNI_OnLoad_0011f7f0[10] + 0xf319be14 +
                    uVar5 * 0x7af29ac0 + (uVar10 >> 2);
  uVar5 = uVar10 >> 0x11 | uVar10 << 0xf;
  uVar2 = uVar2 ^ LAB_001031cc_2 + 0xf319be14 + uVar6 * 0x7af29ac0 + (uVar2 >> 2);
  uVar10 = uVar5 * -0x7a143595;
  uVar6 = uVar2 >> 0x11 | uVar2 << 0xf;
  uVar4 = uVar4 ^ bRam00000000001199b2 + 0xf319be14 + uVar7 * 0x7af29ac0 + (uVar4 >> 2);
  uVar7 = uVar4 >> 0x11 | uVar4 << 0xf;
  uVar2 = uVar6 * -0x7a143595;
  uVar4 = uVar7 * -0x7a143595;
  uVar10 = uVar10 ^ (byte)PTR_JNI_OnLoad_0011f7f0[0xb] + 0xed872555 +
                    uVar5 * 0x7af29ac0 + (uVar10 >> 2);
  uVar5 = uVar10 >> 0x10 | uVar10 << 0x10;
  uVar2 = uVar2 ^ LAB_001031cc_3 + 0xed872555 + uVar6 * 0x7af29ac0 + (uVar2 >> 2);
  uVar10 = uVar5 * -0x7a143595;
  uVar6 = uVar2 >> 0x10 | uVar2 << 0x10;
  uVar4 = uVar4 ^ bRam00000000001199b3 + 0xed872555 + uVar7 * 0x7af29ac0 + (uVar4 >> 2);
  uVar7 = uVar4 >> 0x10 | uVar4 << 0x10;
  uVar2 = uVar6 * -0x7a143595;
  uVar4 = uVar7 * -0x7a143595;
  uVar10 = uVar10 ^ (byte)PTR_JNI_OnLoad_0011f7f0[0xc] + 0xe960848a +
                    uVar5 * 0x7af29ac0 + (uVar10 >> 2);
  uVar5 = uVar10 >> 0xf | uVar10 << 0x11;
  uVar2 = uVar2 ^ DAT_001031d0 + 0xe960848a + uVar6 * 0x7af29ac0 + (uVar2 >> 2);
  uVar10 = uVar5 * -0x7a143595;
  uVar6 = uVar2 >> 0xf | uVar2 << 0x11;
  uVar4 = uVar4 ^ DAT_001199b4 + 0xe960848a + uVar7 * 0x7af29ac0 + (uVar4 >> 2);
  uVar7 = uVar4 >> 0xf | uVar4 << 0x11;
  uVar2 = uVar6 * -0x7a143595;
  uVar4 = uVar7 * -0x7a143595;
  uVar10 = uVar10 ^ (byte)PTR_JNI_OnLoad_0011f7f0[0xd] + 0xe5c2e3a3 +
                    uVar5 * 0x7af29ac0 + (uVar10 >> 2);
  uVar5 = uVar10 >> 0x1b | uVar10 << 5;
  uVar2 = uVar2 ^ DAT_001031d1 + 0xe5c2e3a3 + uVar6 * 0x7af29ac0 + (uVar2 >> 2);
  uVar10 = uVar5 * -0x7a143595;
  uVar6 = uVar2 >> 0x1b | uVar2 << 5;
  uVar4 = uVar4 ^ DAT_001199b5 + 0xe5c2e3a3 + uVar7 * 0x7af29ac0 + (uVar4 >> 2);
  uVar7 = uVar4 >> 0x1b | uVar4 << 5;
  uVar2 = uVar6 * -0x7a143595;
  uVar4 = uVar7 * -0x7a143595;
  uVar10 = uVar10 ^ (byte)PTR_JNI_OnLoad_0011f7f0[0xe] + 0xe08c42e8 +
                    uVar5 * 0x7af29ac0 + (uVar10 >> 2);
  uVar8 = uVar10 >> 0x1a | uVar10 << 6;
  uVar2 = uVar2 ^ DAT_001031d2 + 0xe08c42e8 + uVar6 * 0x7af29ac0 + (uVar2 >> 2);
  uVar5 = uVar8 * -0x7a143595;
  uVar6 = uVar2 >> 0x1a | uVar2 << 6;
  uVar4 = uVar4 ^ DAT_001199b6 + 0xe08c42e8 + uVar7 * 0x7af29ac0 + (uVar4 >> 2);
  uVar4 = uVar4 >> 0x1a | uVar4 << 6;
  uVar2 = uVar6 * -0x7a143595;
  uVar10 = uVar4 * -0x7a143595;
  uVar2 = uVar2 ^ DAT_001031d3 + 0xdc6da219 + uVar6 * 0x7af29ac0 + (uVar2 >> 2);
  uVar10 = uVar10 ^ DAT_001199b7 + 0xdc6da219 + uVar4 * 0x7af29ac0 + (uVar10 >> 2);
  uVar5 = uVar5 ^ (byte)PTR_JNI_OnLoad_0011f7f0[0xf] + 0xdc6da219 +
                  uVar8 * 0x7af29ac0 + (uVar5 >> 2);
  uVar2 = (uVar2 >> 0x19 | uVar2 << 7) * -0x7a143595 ^ 0xa5d426fa;
  uVar2 = uVar2 ^ uVar2 >> 9;
  uVar10 = (uVar10 >> 0x19 | uVar10 << 7) * -0x7a143595 ^ 0xe1a868ea;
  uVar10 = uVar10 ^ uVar10 >> 0xf;
  uVar4 = (uVar5 >> 0x19 | uVar5 << 7) * -0x7a143595 ^ 0xb88949ac;
  uVar4 = uVar4 ^ uVar4 >> 7;
  uVar2 = (uVar2 * -0x78374927 ^ uVar2 * 0x6db20000) * 0x7c4f257f;
  uVar10 = (uVar10 * -0x369fe415 ^ uVar10 * 0xdf58000) * 0x32e7884d;
  uVar4 = (uVar4 * -0x39c4cf91 ^ uVar4 * 0x60de0000) * 0x3dbca3c9;
  uVar2 = uVar4 ^ uVar4 >> 0x10 | uVar2 ^ uVar2 >> 0x10 | uVar10 ^ uVar10 >> 0x10;
  uVar2 = uVar2 ^ uVar2 >> 0xd;
  uVar10 = (uVar2 * 0x54b6bb5 ^ uVar2 * -0x4944b000) * -0x13307ed;
  uVar2 = uVar10 ^ uVar10 >> 0x10;
  uVar10 = FUN_0011b310(uVar2 | (uVar10 | -uVar2) >> 0x1f,&DAT_00123858);
  uVar2 = uVar2 | uVar10 ^ 0xb393a65a;
  uVar10 = uVar2 ^ uVar2 >> 9;
  iVar3 = -((int)(uVar2 | -uVar2) >> 0x1f);
  uVar2 = (uVar10 * -0x4f9dee07 ^ uVar10 * 0x23f20000) * 0x4be5825f;
  uVar10 = (iVar3 + iVar3 * (uint)((ulong)(uVar2 ^ uVar2 >> 0x10) * 0x2aaaaaaab >> 0x21) + 1 & 3) *
           0x70bf3eff;
  uVar2 = uVar10 ^ 0x8f82f6a4;
  UNRECOVERED_JUMPTABLE = (code *)0x104b2c;
  if (uVar10 != 0) {
    UNRECOVERED_JUMPTABLE = (code *)0x104b74;
  }
  pcVar1 = (code *)0x104a3c;
  if (uVar2 != 0xff3dc85b) {
    pcVar1 = UNRECOVERED_JUMPTABLE;
  }
  UNRECOVERED_JUMPTABLE = (code *)0x104a0c;
  if (uVar2 != 0x6efc8b5a) {
    UNRECOVERED_JUMPTABLE = pcVar1;
  }
                    /* WARNING: Could not recover jumptable at 0x00104a08. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*UNRECOVERED_JUMPTABLE)();
  return;
}


