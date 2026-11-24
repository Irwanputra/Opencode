// 0011b310 FUN_0011b310

uint FUN_0011b310(uint param_1,uint *param_2)

{
  char cVar1;
  bool bVar2;
  uint uVar3;
  
  if (DAT_001238b0 != '\0') {
    LOAcquire();
    uVar3 = *param_2;
    *param_2 = uVar3 | param_1;
    LORelease();
    return uVar3;
  }
  do {
    uVar3 = *param_2;
    cVar1 = '\x01';
    bVar2 = (bool)ExclusiveMonitorPass(param_2,0x10);
    if (bVar2) {
      *param_2 = uVar3 | param_1;
      cVar1 = ExclusiveMonitorsStatus();
    }
  } while (cVar1 != '\0');
  return uVar3;
}


