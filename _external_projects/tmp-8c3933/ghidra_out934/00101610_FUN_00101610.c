// 00101610 FUN_00101610

undefined8 FUN_00101610(long param_1,undefined8 *param_2,ulong param_3)

{
  long lVar1;
  undefined8 *puVar2;
  long lVar3;
  undefined1 *puVar4;
  undefined8 *puVar5;
  ulong uVar6;
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  undefined1 *puVar10;
  ulong uVar11;
  undefined8 *puVar12;
  ulong uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 ****local_188;
  undefined8 ****local_180;
  undefined1 auStack_178 [256];
  undefined1 auStack_78 [32];
  long local_58;
  
  lVar1 = tpidr_el0;
  local_180 = &local_188;
  local_58 = *(long *)(lVar1 + 0x28);
  local_188 = &local_180;
  if (param_3 == 0) goto LAB_0010178c;
  uVar6 = *(ulong *)(param_1 + 0x20) >> 3 & 0x3f;
  uVar13 = 0x40 - uVar6;
  *(ulong *)(param_1 + 0x20) = *(ulong *)(param_1 + 0x20) + param_3 * 8;
  lVar3 = param_1 + 0x28;
  uVar8 = param_3 - uVar13;
  if (param_3 < uVar13) {
    if ((param_3 < 8) || (((uVar6 + param_1) - (long)param_2) + 0x28 < 0x20)) {
      uVar8 = 0;
    }
    else {
      if (param_3 < 0x20) {
        uVar13 = 0;
      }
      else {
        uVar14 = *param_2;
        uVar16 = param_2[3];
        uVar15 = param_2[2];
        uVar8 = param_3 & 0xffffffffffffffe0;
        puVar5 = (undefined8 *)(lVar3 + uVar6);
        puVar5[1] = param_2[1];
        *puVar5 = uVar14;
        puVar5[3] = uVar16;
        puVar5[2] = uVar15;
        if (param_3 == uVar8) goto LAB_0010178c;
        uVar13 = uVar8;
        if ((param_3 & 0x18) == 0) goto LAB_00101690;
      }
      uVar8 = param_3 & 0xfffffffffffffff8;
      lVar3 = uVar13 - uVar8;
      puVar5 = (undefined8 *)((long)param_2 + uVar13);
      puVar12 = (undefined8 *)(uVar13 + param_1 + uVar6 + 0x28);
      do {
        lVar3 = lVar3 + 8;
        *puVar12 = *puVar5;
        puVar5 = puVar5 + 1;
        puVar12 = puVar12 + 1;
      } while (lVar3 != 0);
      if (param_3 == uVar8) goto LAB_0010178c;
    }
LAB_00101690:
    lVar3 = param_3 - uVar8;
    puVar4 = (undefined1 *)(uVar8 + uVar6 + param_1 + 0x28);
    puVar10 = (undefined1 *)((long)param_2 + uVar8);
    do {
      lVar3 = lVar3 + -1;
      *puVar4 = *puVar10;
      puVar4 = puVar4 + 1;
      puVar10 = puVar10 + 1;
    } while (lVar3 != 0);
    goto LAB_0010178c;
  }
  if ((uVar6 < 0x39) && (0x1f < ((uVar6 + param_1) - (long)param_2) + 0x28)) {
    if (uVar6 < 0x21) {
      uVar14 = *param_2;
      uVar16 = param_2[3];
      uVar15 = param_2[2];
      uVar9 = uVar13 & 0x60;
      puVar5 = (undefined8 *)(lVar3 + uVar6);
      puVar5[1] = param_2[1];
      *puVar5 = uVar14;
      puVar5[3] = uVar16;
      puVar5[2] = uVar15;
      if (uVar9 != 0x20) {
        uVar14 = param_2[4];
        uVar16 = param_2[7];
        uVar15 = param_2[6];
        lVar7 = uVar6 + lVar3;
        *(undefined8 *)(lVar7 + 0x28) = param_2[5];
        *(undefined8 *)(lVar7 + 0x20) = uVar14;
        *(undefined8 *)(lVar7 + 0x38) = uVar16;
        *(undefined8 *)(lVar7 + 0x30) = uVar15;
      }
      if (uVar13 != uVar9) {
        uVar11 = uVar9;
        if ((uVar13 & 0x18) == 0) goto LAB_001016d8;
        goto LAB_00101878;
      }
    }
    else {
      uVar11 = 0;
LAB_00101878:
      uVar9 = uVar13 & 0x78;
      lVar7 = uVar11 - uVar9;
      puVar5 = (undefined8 *)((long)param_2 + uVar11);
      puVar12 = (undefined8 *)(uVar11 + param_1 + uVar6 + 0x28);
      do {
        lVar7 = lVar7 + 8;
        *puVar12 = *puVar5;
        puVar5 = puVar5 + 1;
        puVar12 = puVar12 + 1;
      } while (lVar7 != 0);
      if (uVar13 != uVar9) goto LAB_001016d8;
    }
  }
  else {
    uVar9 = 0;
LAB_001016d8:
    lVar7 = uVar9 + uVar6;
    puVar4 = (undefined1 *)((long)param_2 + uVar9);
    do {
      *(undefined1 *)(lVar3 + lVar7) = *puVar4;
      lVar7 = lVar7 + 1;
      puVar4 = puVar4 + 1;
    } while (lVar7 != 0x40);
  }
  FUN_00101920(param_1,lVar3,auStack_178,auStack_78);
  lVar3 = (long)param_2 + uVar13;
  for (; 0x3f < uVar8; uVar8 = uVar8 - 0x40) {
    FUN_00101920(param_1,lVar3,auStack_178,auStack_78);
    lVar3 = lVar3 + 0x40;
  }
  if (uVar8 != 0) {
    if ((uVar8 < 8) || ((param_1 - lVar3) + 0x28U < 0x20)) {
      uVar6 = 0;
    }
    else {
      if (uVar8 < 0x20) {
        uVar13 = 0;
      }
      else {
        uVar6 = uVar8 & 0x20;
        puVar5 = (undefined8 *)(lVar3 + 0x10);
        puVar12 = (undefined8 *)(param_1 + 0x38);
        uVar13 = uVar6;
        do {
          puVar2 = puVar5 + -1;
          uVar14 = puVar5[-2];
          uVar16 = puVar5[1];
          uVar15 = *puVar5;
          uVar13 = uVar13 - 0x20;
          puVar5 = puVar5 + 4;
          puVar12[-1] = *puVar2;
          puVar12[-2] = uVar14;
          puVar12[1] = uVar16;
          *puVar12 = uVar15;
          puVar12 = puVar12 + 4;
        } while (uVar13 != 0);
        if (uVar8 == uVar6) goto LAB_00101780;
        uVar13 = uVar6;
        if ((uVar8 & 0x18) == 0) goto LAB_00101760;
      }
      uVar6 = uVar8 & 0x38;
      lVar7 = uVar13 - uVar6;
      puVar5 = (undefined8 *)(lVar3 + uVar13);
      puVar12 = (undefined8 *)(uVar13 + param_1 + 0x28);
      do {
        lVar7 = lVar7 + 8;
        *puVar12 = *puVar5;
        puVar5 = puVar5 + 1;
        puVar12 = puVar12 + 1;
      } while (lVar7 != 0);
      if (uVar8 == uVar6) goto LAB_00101780;
    }
LAB_00101760:
    lVar7 = uVar8 - uVar6;
    puVar4 = (undefined1 *)(lVar3 + uVar6);
    puVar10 = (undefined1 *)(uVar6 + param_1 + 0x28);
    do {
      lVar7 = lVar7 + -1;
      *puVar10 = *puVar4;
      puVar4 = puVar4 + 1;
      puVar10 = puVar10 + 1;
    } while (lVar7 != 0);
  }
LAB_00101780:
  FUN_001199a8(auStack_178,0x120);
LAB_0010178c:
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return 0;
}


