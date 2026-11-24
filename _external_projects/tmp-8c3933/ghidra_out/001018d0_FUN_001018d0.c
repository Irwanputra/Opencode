// 001018d0 FUN_001018d0

void FUN_001018d0(int *param_1,uint *param_2,uint *param_3,uint *param_4)

{
  uint *puVar1;
  int iVar2;
  uint uVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  uint uVar9;
  uint uVar10;
  uint uVar11;
  uint uVar12;
  uint uVar13;
  uint uVar14;
  uint uVar15;
  uint uVar16;
  uint uVar17;
  uint uVar18;
  long lVar19;
  int *piVar20;
  long lVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined1 uVar24;
  undefined1 uVar26;
  undefined1 uVar27;
  undefined1 uVar28;
  undefined1 uVar29;
  undefined1 uVar30;
  undefined1 uVar31;
  undefined1 uVar32;
  undefined8 uVar25;
  undefined1 uVar33;
  undefined1 uVar34;
  undefined1 uVar35;
  undefined1 uVar36;
  undefined1 uVar37;
  undefined1 uVar38;
  undefined1 uVar39;
  undefined1 uVar40;
  undefined1 uVar41;
  undefined1 uVar42;
  undefined1 uVar43;
  undefined1 uVar44;
  undefined1 uVar45;
  undefined1 uVar46;
  undefined1 uVar47;
  undefined1 uVar48;
  undefined1 uVar49;
  undefined1 uVar50;
  undefined1 uVar51;
  undefined1 uVar52;
  undefined1 uVar53;
  undefined1 uVar54;
  undefined1 uVar55;
  undefined1 uVar56;
  undefined1 uVar57;
  undefined1 uVar58;
  undefined1 uVar59;
  undefined1 uVar60;
  undefined1 uVar61;
  undefined1 uVar62;
  undefined1 uVar63;
  undefined1 uVar64;
  undefined1 uVar65;
  undefined1 uVar66;
  
  if ((param_3 < param_2 + 0x10) && (param_2 < param_3 + 0x10)) {
    lVar19 = 0;
    lVar21 = (long)param_2 + 1;
    do {
      puVar1 = (uint *)(lVar21 + -1);
      lVar21 = lVar21 + 4;
      uVar18 = (*puVar1 & 0xff00ff00) >> 8 | (*puVar1 & 0xff00ff) << 8;
      param_3[lVar19] = uVar18 >> 0x10 | uVar18 << 0x10;
      lVar19 = lVar19 + 1;
    } while (lVar19 != 0x10);
  }
  else {
    uVar18 = *param_2;
    uVar24 = *(undefined1 *)((long)param_2 + 1);
    uVar39 = *(undefined1 *)((long)param_2 + 2);
    uVar53 = *(undefined1 *)((long)param_2 + 3);
    uVar8 = param_2[1];
    uVar26 = *(undefined1 *)((long)param_2 + 5);
    uVar40 = *(undefined1 *)((long)param_2 + 6);
    uVar54 = *(undefined1 *)((long)param_2 + 7);
    uVar13 = param_2[2];
    uVar27 = *(undefined1 *)((long)param_2 + 9);
    uVar41 = *(undefined1 *)((long)param_2 + 10);
    uVar55 = *(undefined1 *)((long)param_2 + 0xb);
    uVar7 = param_2[3];
    uVar28 = *(undefined1 *)((long)param_2 + 0xd);
    uVar42 = *(undefined1 *)((long)param_2 + 0xe);
    uVar56 = *(undefined1 *)((long)param_2 + 0xf);
    uVar3 = param_2[4];
    uVar29 = *(undefined1 *)((long)param_2 + 0x11);
    uVar43 = *(undefined1 *)((long)param_2 + 0x12);
    uVar57 = *(undefined1 *)((long)param_2 + 0x13);
    uVar4 = param_2[5];
    uVar30 = *(undefined1 *)((long)param_2 + 0x15);
    uVar44 = *(undefined1 *)((long)param_2 + 0x16);
    uVar58 = *(undefined1 *)((long)param_2 + 0x17);
    uVar12 = param_2[6];
    uVar31 = *(undefined1 *)((long)param_2 + 0x19);
    uVar45 = *(undefined1 *)((long)param_2 + 0x1a);
    uVar59 = *(undefined1 *)((long)param_2 + 0x1b);
    uVar6 = param_2[7];
    uVar32 = *(undefined1 *)((long)param_2 + 0x1d);
    uVar46 = *(undefined1 *)((long)param_2 + 0x1e);
    uVar60 = *(undefined1 *)((long)param_2 + 0x1f);
    uVar5 = param_2[8];
    uVar33 = *(undefined1 *)((long)param_2 + 0x21);
    uVar47 = *(undefined1 *)((long)param_2 + 0x22);
    uVar61 = *(undefined1 *)((long)param_2 + 0x23);
    uVar9 = param_2[9];
    uVar34 = *(undefined1 *)((long)param_2 + 0x25);
    uVar48 = *(undefined1 *)((long)param_2 + 0x26);
    uVar62 = *(undefined1 *)((long)param_2 + 0x27);
    uVar10 = param_2[0xc];
    uVar35 = *(undefined1 *)((long)param_2 + 0x31);
    uVar49 = *(undefined1 *)((long)param_2 + 0x32);
    uVar63 = *(undefined1 *)((long)param_2 + 0x33);
    uVar11 = param_2[0xd];
    uVar36 = *(undefined1 *)((long)param_2 + 0x35);
    uVar50 = *(undefined1 *)((long)param_2 + 0x36);
    uVar64 = *(undefined1 *)((long)param_2 + 0x37);
    uVar14 = param_2[0xe];
    uVar37 = *(undefined1 *)((long)param_2 + 0x39);
    uVar51 = *(undefined1 *)((long)param_2 + 0x3a);
    uVar65 = *(undefined1 *)((long)param_2 + 0x3b);
    uVar15 = param_2[0xf];
    uVar38 = *(undefined1 *)((long)param_2 + 0x3d);
    uVar52 = *(undefined1 *)((long)param_2 + 0x3e);
    uVar66 = *(undefined1 *)((long)param_2 + 0x3f);
    *(ulong *)(param_3 + 10) =
         CONCAT17((char)param_2[0xb],
                  CONCAT16(*(undefined1 *)((long)param_2 + 0x2d),
                           CONCAT15(*(undefined1 *)((long)param_2 + 0x2e),
                                    CONCAT14(*(undefined1 *)((long)param_2 + 0x2f),
                                             CONCAT13((char)param_2[10],
                                                      CONCAT12(*(undefined1 *)((long)param_2 + 0x29)
                                                               ,CONCAT11(*(undefined1 *)
                                                                          ((long)param_2 + 0x2a),
                                                                         *(undefined1 *)
                                                                          ((long)param_2 + 0x2b)))))
                                   )));
    *(ulong *)(param_3 + 8) =
         CONCAT17((char)uVar9,
                  CONCAT16(uVar34,CONCAT15(uVar48,CONCAT14(uVar62,CONCAT13((char)uVar5,
                                                                           CONCAT12(uVar33,CONCAT11(
                                                  uVar47,uVar61)))))));
    *(ulong *)(param_3 + 0xe) =
         CONCAT17((char)uVar15,
                  CONCAT16(uVar38,CONCAT15(uVar52,CONCAT14(uVar66,CONCAT13((char)uVar14,
                                                                           CONCAT12(uVar37,CONCAT11(
                                                  uVar51,uVar65)))))));
    *(ulong *)(param_3 + 0xc) =
         CONCAT17((char)uVar11,
                  CONCAT16(uVar36,CONCAT15(uVar50,CONCAT14(uVar64,CONCAT13((char)uVar10,
                                                                           CONCAT12(uVar35,CONCAT11(
                                                  uVar49,uVar63)))))));
    *(ulong *)(param_3 + 2) =
         CONCAT17((char)uVar7,
                  CONCAT16(uVar28,CONCAT15(uVar42,CONCAT14(uVar56,CONCAT13((char)uVar13,
                                                                           CONCAT12(uVar27,CONCAT11(
                                                  uVar41,uVar55)))))));
    *(ulong *)param_3 =
         CONCAT17((char)uVar8,
                  CONCAT16(uVar26,CONCAT15(uVar40,CONCAT14(uVar54,CONCAT13((char)uVar18,
                                                                           CONCAT12(uVar24,CONCAT11(
                                                  uVar39,uVar53)))))));
    *(ulong *)(param_3 + 6) =
         CONCAT17((char)uVar6,
                  CONCAT16(uVar32,CONCAT15(uVar46,CONCAT14(uVar60,CONCAT13((char)uVar12,
                                                                           CONCAT12(uVar31,CONCAT11(
                                                  uVar45,uVar59)))))));
    *(ulong *)(param_3 + 4) =
         CONCAT17((char)uVar4,
                  CONCAT16(uVar30,CONCAT15(uVar44,CONCAT14(uVar58,CONCAT13((char)uVar3,
                                                                           CONCAT12(uVar29,CONCAT11(
                                                  uVar43,uVar57)))))));
  }
  uVar25 = *(undefined8 *)param_1;
  uVar23 = *(undefined8 *)(param_1 + 6);
  uVar22 = *(undefined8 *)(param_1 + 4);
  piVar20 = &DAT_00100cb0;
  lVar21 = 0x30;
  *(undefined8 *)(param_4 + 2) = *(undefined8 *)(param_1 + 2);
  *(undefined8 *)param_4 = uVar25;
  *(undefined8 *)(param_4 + 6) = uVar23;
  *(undefined8 *)(param_4 + 4) = uVar22;
  while( true ) {
    uVar6 = param_4[4];
    uVar12 = param_4[5];
    uVar7 = *param_4;
    uVar13 = param_4[1];
    uVar8 = param_4[2];
    iVar2 = *param_3 + piVar20[-8] + (uVar12 & uVar6 | param_4[6] & (uVar6 ^ 0xffffffff)) +
            param_4[7] +
            ((uVar6 >> 6 | uVar6 << 0x1a) ^ (uVar6 >> 0xb | uVar6 << 0x15) ^
            (uVar6 >> 0x19 | uVar6 << 7));
    uVar18 = iVar2 + param_4[3];
    uVar3 = ((uVar7 >> 2 | uVar7 << 0x1e) ^ (uVar7 >> 0xd | uVar7 << 0x13) ^
            (uVar7 >> 0x16 | uVar7 << 10)) + ((uVar8 | uVar13) & uVar7 | uVar8 & uVar13) + iVar2;
    param_4[3] = uVar18;
    param_4[7] = uVar3;
    iVar2 = (uVar6 & uVar18 | uVar12 & (uVar18 ^ 0xffffffff)) + param_4[6] + param_3[1] +
            piVar20[-7] +
            ((uVar18 >> 6 | uVar18 * 0x4000000) ^ (uVar18 >> 0xb | uVar18 * 0x200000) ^
            (uVar18 >> 0x19 | uVar18 * 0x80));
    uVar8 = iVar2 + uVar8;
    uVar4 = (uVar3 & (uVar13 | uVar7) | uVar13 & uVar7) +
            ((uVar3 >> 2 | uVar3 * 0x40000000) ^ (uVar3 >> 0xd | uVar3 * 0x80000) ^
            (uVar3 >> 0x16 | uVar3 * 0x400)) + iVar2;
    param_4[2] = uVar8;
    param_4[6] = uVar4;
    iVar2 = param_3[2] + uVar12 + piVar20[-6] + (uVar18 & uVar8 | uVar6 & (uVar8 ^ 0xffffffff)) +
            ((uVar8 >> 6 | uVar8 * 0x4000000) ^ (uVar8 >> 0xb | uVar8 * 0x200000) ^
            (uVar8 >> 0x19 | uVar8 * 0x80));
    uVar13 = iVar2 + uVar13;
    uVar12 = ((uVar4 >> 2 | uVar4 * 0x40000000) ^ (uVar4 >> 0xd | uVar4 * 0x80000) ^
             (uVar4 >> 0x16 | uVar4 * 0x400)) + (uVar4 & (uVar3 | uVar7) | uVar3 & uVar7) + iVar2;
    param_4[1] = uVar13;
    param_4[5] = uVar12;
    iVar2 = param_3[3] + uVar6 + piVar20[-5] + (uVar8 & uVar13 | uVar18 & (uVar13 ^ 0xffffffff)) +
            ((uVar13 >> 6 | uVar13 * 0x4000000) ^ (uVar13 >> 0xb | uVar13 * 0x200000) ^
            (uVar13 >> 0x19 | uVar13 * 0x80));
    uVar7 = iVar2 + uVar7;
    uVar6 = ((uVar12 >> 2 | uVar12 * 0x40000000) ^ (uVar12 >> 0xd | uVar12 * 0x80000) ^
            (uVar12 >> 0x16 | uVar12 * 0x400)) + (uVar12 & (uVar4 | uVar3) | uVar4 & uVar3) + iVar2;
    *param_4 = uVar7;
    param_4[4] = uVar6;
    iVar2 = param_3[4] + piVar20[-4] + uVar18 + (uVar13 & uVar7 | uVar8 & (uVar7 ^ 0xffffffff)) +
            ((uVar7 >> 6 | uVar7 * 0x4000000) ^ (uVar7 >> 0xb | uVar7 * 0x200000) ^
            (uVar7 >> 0x19 | uVar7 * 0x80));
    uVar3 = iVar2 + uVar3;
    uVar18 = ((uVar6 >> 2 | uVar6 * 0x40000000) ^ (uVar6 >> 0xd | uVar6 * 0x80000) ^
             (uVar6 >> 0x16 | uVar6 * 0x400)) + (uVar6 & (uVar12 | uVar4) | uVar12 & uVar4) + iVar2;
    param_4[7] = uVar3;
    param_4[3] = uVar18;
    iVar2 = param_3[5] + piVar20[-3] + uVar8 + (uVar7 & uVar3 | uVar13 & (uVar3 ^ 0xffffffff)) +
            ((uVar3 >> 6 | uVar3 * 0x4000000) ^ (uVar3 >> 0xb | uVar3 * 0x200000) ^
            (uVar3 >> 0x19 | uVar3 * 0x80));
    uVar4 = iVar2 + uVar4;
    uVar8 = ((uVar18 >> 2 | uVar18 * 0x40000000) ^ (uVar18 >> 0xd | uVar18 * 0x80000) ^
            (uVar18 >> 0x16 | uVar18 * 0x400)) + (uVar18 & (uVar6 | uVar12) | uVar6 & uVar12) +
            iVar2;
    param_4[6] = uVar4;
    param_4[2] = uVar8;
    iVar2 = param_3[6] + piVar20[-2] + uVar13 + (uVar3 & uVar4 | uVar7 & (uVar4 ^ 0xffffffff)) +
            ((uVar4 >> 6 | uVar4 * 0x4000000) ^ (uVar4 >> 0xb | uVar4 * 0x200000) ^
            (uVar4 >> 0x19 | uVar4 * 0x80));
    uVar12 = iVar2 + uVar12;
    uVar13 = ((uVar8 >> 2 | uVar8 * 0x40000000) ^ (uVar8 >> 0xd | uVar8 * 0x80000) ^
             (uVar8 >> 0x16 | uVar8 * 0x400)) + (uVar8 & (uVar18 | uVar6) | uVar18 & uVar6) + iVar2;
    param_4[5] = uVar12;
    param_4[1] = uVar13;
    iVar2 = param_3[7] + piVar20[-1] + uVar7 + (uVar4 & uVar12 | uVar3 & (uVar12 ^ 0xffffffff)) +
            ((uVar12 >> 6 | uVar12 * 0x4000000) ^ (uVar12 >> 0xb | uVar12 * 0x200000) ^
            (uVar12 >> 0x19 | uVar12 * 0x80));
    uVar6 = iVar2 + uVar6;
    uVar7 = ((uVar13 >> 2 | uVar13 * 0x40000000) ^ (uVar13 >> 0xd | uVar13 * 0x80000) ^
            (uVar13 >> 0x16 | uVar13 * 0x400)) + (uVar13 & (uVar8 | uVar18) | uVar8 & uVar18) +
            iVar2;
    param_4[4] = uVar6;
    *param_4 = uVar7;
    iVar2 = param_3[8] + *piVar20 + uVar3 + (uVar12 & uVar6 | uVar4 & (uVar6 ^ 0xffffffff)) +
            ((uVar6 >> 6 | uVar6 * 0x4000000) ^ (uVar6 >> 0xb | uVar6 * 0x200000) ^
            (uVar6 >> 0x19 | uVar6 * 0x80));
    uVar18 = iVar2 + uVar18;
    uVar5 = ((uVar7 >> 2 | uVar7 * 0x40000000) ^ (uVar7 >> 0xd | uVar7 * 0x80000) ^
            (uVar7 >> 0x16 | uVar7 * 0x400)) + (uVar7 & (uVar13 | uVar8) | uVar13 & uVar8) + iVar2;
    param_4[3] = uVar18;
    param_4[7] = uVar5;
    iVar2 = param_3[9] + piVar20[1] + uVar4 + (uVar6 & uVar18 | uVar12 & (uVar18 ^ 0xffffffff)) +
            ((uVar18 >> 6 | uVar18 * 0x4000000) ^ (uVar18 >> 0xb | uVar18 * 0x200000) ^
            (uVar18 >> 0x19 | uVar18 * 0x80));
    uVar8 = iVar2 + uVar8;
    uVar4 = ((uVar5 >> 2 | uVar5 * 0x40000000) ^ (uVar5 >> 0xd | uVar5 * 0x80000) ^
            (uVar5 >> 0x16 | uVar5 * 0x400)) + (uVar5 & (uVar7 | uVar13) | uVar7 & uVar13) + iVar2;
    param_4[2] = uVar8;
    param_4[6] = uVar4;
    iVar2 = uVar12 + param_3[10] + piVar20[2] + (uVar18 & uVar8 | uVar6 & (uVar8 ^ 0xffffffff)) +
            ((uVar8 >> 6 | uVar8 * 0x4000000) ^ (uVar8 >> 0xb | uVar8 * 0x200000) ^
            (uVar8 >> 0x19 | uVar8 * 0x80));
    uVar13 = iVar2 + uVar13;
    uVar12 = ((uVar4 >> 2 | uVar4 * 0x40000000) ^ (uVar4 >> 0xd | uVar4 * 0x80000) ^
             (uVar4 >> 0x16 | uVar4 * 0x400)) + (uVar4 & (uVar5 | uVar7) | uVar5 & uVar7) + iVar2;
    param_4[1] = uVar13;
    param_4[5] = uVar12;
    iVar2 = piVar20[3] + param_3[0xb] + uVar6 + (uVar8 & uVar13 | uVar18 & (uVar13 ^ 0xffffffff)) +
            ((uVar13 >> 6 | uVar13 * 0x4000000) ^ (uVar13 >> 0xb | uVar13 * 0x200000) ^
            (uVar13 >> 0x19 | uVar13 * 0x80));
    uVar7 = iVar2 + uVar7;
    uVar3 = ((uVar12 >> 2 | uVar12 * 0x40000000) ^ (uVar12 >> 0xd | uVar12 * 0x80000) ^
            (uVar12 >> 0x16 | uVar12 * 0x400)) + (uVar12 & (uVar4 | uVar5) | uVar4 & uVar5) + iVar2;
    *param_4 = uVar7;
    param_4[4] = uVar3;
    iVar2 = piVar20[4] + param_3[0xc] + uVar18 + (uVar13 & uVar7 | uVar8 & (uVar7 ^ 0xffffffff)) +
            ((uVar7 >> 6 | uVar7 * 0x4000000) ^ (uVar7 >> 0xb | uVar7 * 0x200000) ^
            (uVar7 >> 0x19 | uVar7 * 0x80));
    uVar5 = iVar2 + uVar5;
    uVar18 = ((uVar3 >> 2 | uVar3 * 0x40000000) ^ (uVar3 >> 0xd | uVar3 * 0x80000) ^
             (uVar3 >> 0x16 | uVar3 * 0x400)) + (uVar3 & (uVar12 | uVar4) | uVar12 & uVar4) + iVar2;
    param_4[7] = uVar5;
    param_4[3] = uVar18;
    iVar2 = piVar20[5] + param_3[0xd] + uVar8 + (uVar7 & uVar5 | uVar13 & (uVar5 ^ 0xffffffff)) +
            ((uVar5 >> 6 | uVar5 * 0x4000000) ^ (uVar5 >> 0xb | uVar5 * 0x200000) ^
            (uVar5 >> 0x19 | uVar5 * 0x80));
    uVar4 = iVar2 + uVar4;
    uVar8 = ((uVar18 >> 2 | uVar18 * 0x40000000) ^ (uVar18 >> 0xd | uVar18 * 0x80000) ^
            (uVar18 >> 0x16 | uVar18 * 0x400)) + (uVar18 & (uVar3 | uVar12) | uVar3 & uVar12) +
            iVar2;
    param_4[6] = uVar4;
    param_4[2] = uVar8;
    iVar2 = piVar20[6] + param_3[0xe] + uVar13 + (uVar5 & uVar4 | uVar7 & (uVar4 ^ 0xffffffff)) +
            ((uVar4 >> 6 | uVar4 * 0x4000000) ^ (uVar4 >> 0xb | uVar4 * 0x200000) ^
            (uVar4 >> 0x19 | uVar4 * 0x80));
    uVar12 = iVar2 + uVar12;
    uVar13 = ((uVar8 >> 2 | uVar8 * 0x40000000) ^ (uVar8 >> 0xd | uVar8 * 0x80000) ^
             (uVar8 >> 0x16 | uVar8 * 0x400)) + (uVar8 & (uVar18 | uVar3) | uVar18 & uVar3) + iVar2;
    param_4[5] = uVar12;
    param_4[1] = uVar13;
    iVar2 = piVar20[7] + param_3[0xf] + uVar7 + (uVar4 & uVar12 | uVar5 & (uVar12 ^ 0xffffffff)) +
            ((uVar12 >> 6 | uVar12 * 0x4000000) ^ (uVar12 >> 0xb | uVar12 * 0x200000) ^
            (uVar12 >> 0x19 | uVar12 * 0x80));
    uVar18 = ((uVar13 >> 2 | uVar13 * 0x40000000) ^ (uVar13 >> 0xd | uVar13 * 0x80000) ^
             (uVar13 >> 0x16 | uVar13 * 0x400)) + (uVar13 & (uVar8 | uVar18) | uVar8 & uVar18) +
             iVar2;
    param_4[4] = iVar2 + uVar3;
    *param_4 = uVar18;
    if (lVar21 == 0) break;
    uVar5 = param_3[0xe];
    uVar14 = param_3[0xf];
    uVar8 = param_3[1];
    uVar13 = param_3[2];
    uVar7 = param_3[3];
    piVar20 = piVar20 + 0x10;
    lVar21 = lVar21 + -0x10;
    uVar9 = param_3[8];
    uVar15 = param_3[9];
    uVar10 = param_3[10];
    uVar16 = param_3[0xb];
    uVar3 = param_3[4];
    uVar4 = param_3[5];
    uVar18 = ((uVar5 >> 0x11 | uVar5 << 0xf) ^ (uVar5 >> 0x13 | uVar5 << 0xd) ^ uVar5 >> 10) +
             uVar15 + *param_3 +
             ((uVar8 >> 7 | uVar8 << 0x19) ^ (uVar8 >> 0x12 | uVar8 << 0xe) ^ uVar8 >> 3);
    uVar8 = uVar10 + uVar8 +
            ((uVar14 >> 0x11 | uVar14 << 0xf) ^ (uVar14 >> 0x13 | uVar14 << 0xd) ^ uVar14 >> 10) +
            ((uVar13 >> 7 | uVar13 << 0x19) ^ (uVar13 >> 0x12 | uVar13 << 0xe) ^ uVar13 >> 3);
    uVar11 = param_3[0xc];
    uVar17 = param_3[0xd];
    param_3[0x10] = uVar18;
    param_3[0x11] = uVar8;
    uVar13 = uVar16 + uVar13 +
             ((uVar7 >> 7 | uVar7 << 0x19) ^ (uVar7 >> 0x12 | uVar7 << 0xe) ^ uVar7 >> 3) +
             ((uVar18 >> 0x11 | uVar18 * 0x8000) ^ (uVar18 >> 0x13 | uVar18 * 0x2000) ^ uVar18 >> 10
             );
    uVar12 = param_3[6];
    uVar6 = param_3[7];
    uVar7 = uVar11 + uVar7 +
            ((uVar3 >> 7 | uVar3 << 0x19) ^ (uVar3 >> 0x12 | uVar3 << 0xe) ^ uVar3 >> 3) +
            ((uVar8 >> 0x11 | uVar8 * 0x8000) ^ (uVar8 >> 0x13 | uVar8 * 0x2000) ^ uVar8 >> 10);
    param_3[0x12] = uVar13;
    param_3[0x13] = uVar7;
    uVar3 = uVar17 + uVar3 +
            ((uVar4 >> 7 | uVar4 << 0x19) ^ (uVar4 >> 0x12 | uVar4 << 0xe) ^ uVar4 >> 3) +
            ((uVar13 >> 0x11 | uVar13 * 0x8000) ^ (uVar13 >> 0x13 | uVar13 * 0x2000) ^ uVar13 >> 10)
    ;
    uVar4 = uVar4 + uVar5 +
            ((uVar12 >> 7 | uVar12 << 0x19) ^ (uVar12 >> 0x12 | uVar12 << 0xe) ^ uVar12 >> 3) +
            ((uVar7 >> 0x11 | uVar7 * 0x8000) ^ (uVar7 >> 0x13 | uVar7 * 0x2000) ^ uVar7 >> 10);
    param_3[0x14] = uVar3;
    param_3[0x15] = uVar4;
    uVar12 = uVar12 + uVar14 +
             ((uVar6 >> 7 | uVar6 << 0x19) ^ (uVar6 >> 0x12 | uVar6 << 0xe) ^ uVar6 >> 3) +
             ((uVar3 >> 0x11 | uVar3 * 0x8000) ^ (uVar3 >> 0x13 | uVar3 * 0x2000) ^ uVar3 >> 10);
    uVar6 = uVar6 + ((uVar9 >> 7 | uVar9 << 0x19) ^ (uVar9 >> 0x12 | uVar9 << 0xe) ^ uVar9 >> 3) +
            uVar18 + ((uVar4 >> 0x11 | uVar4 * 0x8000) ^ (uVar4 >> 0x13 | uVar4 * 0x2000) ^
                     uVar4 >> 10);
    param_3[0x16] = uVar12;
    param_3[0x17] = uVar6;
    uVar8 = uVar8 + ((uVar15 >> 7 | uVar15 << 0x19) ^ (uVar15 >> 0x12 | uVar15 << 0xe) ^ uVar15 >> 3
                    ) + uVar9 +
            ((uVar12 >> 0x11 | uVar12 * 0x8000) ^ (uVar12 >> 0x13 | uVar12 * 0x2000) ^ uVar12 >> 10)
    ;
    uVar13 = ((uVar10 >> 7 | uVar10 << 0x19) ^ (uVar10 >> 0x12 | uVar10 << 0xe) ^ uVar10 >> 3) +
             uVar15 + uVar13 +
             ((uVar6 >> 0x11 | uVar6 * 0x8000) ^ (uVar6 >> 0x13 | uVar6 * 0x2000) ^ uVar6 >> 10);
    uVar7 = ((uVar16 >> 7 | uVar16 << 0x19) ^ (uVar16 >> 0x12 | uVar16 << 0xe) ^ uVar16 >> 3) +
            uVar10 + uVar7 +
            ((uVar8 >> 0x11 | uVar8 * 0x8000) ^ (uVar8 >> 0x13 | uVar8 * 0x2000) ^ uVar8 >> 10);
    param_3[0x18] = uVar8;
    param_3[0x19] = uVar13;
    uVar13 = ((uVar11 >> 7 | uVar11 << 0x19) ^ (uVar11 >> 0x12 | uVar11 << 0xe) ^ uVar11 >> 3) +
             uVar16 + uVar3 +
             ((uVar13 >> 0x11 | uVar13 * 0x8000) ^ (uVar13 >> 0x13 | uVar13 * 0x2000) ^ uVar13 >> 10
             );
    param_3[0x1a] = uVar7;
    param_3[0x1b] = uVar13;
    uVar7 = ((uVar17 >> 7 | uVar17 << 0x19) ^ (uVar17 >> 0x12 | uVar17 << 0xe) ^ uVar17 >> 3) +
            uVar11 + uVar4 +
            ((uVar7 >> 0x11 | uVar7 * 0x8000) ^ (uVar7 >> 0x13 | uVar7 * 0x2000) ^ uVar7 >> 10);
    uVar13 = uVar17 + ((uVar5 >> 7 | uVar5 << 0x19) ^ (uVar5 >> 0x12 | uVar5 << 0xe) ^ uVar5 >> 3) +
             uVar12 + ((uVar13 >> 0x11 | uVar13 * 0x8000) ^ (uVar13 >> 0x13 | uVar13 * 0x2000) ^
                      uVar13 >> 10);
    param_3[0x1c] = uVar7;
    param_3[0x1d] = uVar13;
    param_3[0x1e] =
         ((uVar14 >> 7 | uVar14 << 0x19) ^ (uVar14 >> 0x12 | uVar14 << 0xe) ^ uVar14 >> 3) + uVar5 +
         uVar6 + ((uVar7 >> 0x11 | uVar7 * 0x8000) ^ (uVar7 >> 0x13 | uVar7 * 0x2000) ^ uVar7 >> 10)
    ;
    param_3[0x1f] =
         ((uVar18 >> 7 | uVar18 * 0x2000000) ^ (uVar18 >> 0x12 | uVar18 * 0x4000) ^ uVar18 >> 3) +
         uVar14 + uVar8 +
         ((uVar13 >> 0x11 | uVar13 * 0x8000) ^ (uVar13 >> 0x13 | uVar13 * 0x2000) ^ uVar13 >> 10);
    param_3 = param_3 + 0x10;
  }
  *param_1 = *param_1 + uVar18;
  param_1[1] = param_1[1] + param_4[1];
  param_1[2] = param_1[2] + param_4[2];
  param_1[3] = param_1[3] + param_4[3];
  param_1[4] = param_1[4] + param_4[4];
  param_1[5] = param_1[5] + param_4[5];
  param_1[6] = param_1[6] + param_4[6];
  param_1[7] = param_1[7] + param_4[7];
  return;
}


