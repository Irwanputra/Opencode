## evidence_id

ev_109fd344380cf0ab7327c5a0186ca62ae5f5c408f39242b2c4f24562f3e247ad

## subject.name

lib_eCrypt.so

## subject.digest

| Key    | Value                                                            |
|--------|------------------------------------------------------------------|
| sha256 | c8f8b88a67a9e76a82944bc47de87ea2b8b7700a9228690e3328fb223b5d87fc |

## subject.local_path

/tmp/opencode/target/lib_eCrypt.so

## subject.format

elf

## subject.architecture

arm

## provider

| Key     | Value  |
|---------|--------|
| id      | ghidra |
| name    | Ghidra |
| version | 12.1.4 |

## analysis_profile.provider

| Key     | Value  |
|---------|--------|
| id      | ghidra |
| name    | Ghidra |
| version | 12.1.4 |

## analysis_profile.parameters.target_kind

executable

## analysis_profile.parameters.target_format

elf

## analysis_profile.parameters.architecture

arm

## analysis_profile.parameters.available_architectures

["arm"]

## analysis_profile.parameters.import_mode

ephemeral-source-immutable

## analysis_profile.parameters.annotation_policy

atomic-function-entry-metadata-v1

## analysis_profile.parameters.load_image_observations

source-mappings-entry-context-v2

## analysis_profile.parameters.function_body_evidence

complete-inclusive-ranges-v1

## analysis_profile.parameters.function_references

complete-body-and-entry-reference-manager-v2

## analysis_profile.parameters.call_relationship_coverage

function-body-call-coverage-v5

## analysis_profile.parameters.function_dossier_coverage

observed-facets-and-call-relationships-v1

## analysis_profile.parameters.string_inventory_evidence

defined-data-coverage-v1

## analysis_profile.parameters.location_resolution

explicit-address-exact-entry-symbol-first-v3

## analysis_profile.parameters.procedure_file_offset_resolution

address-first-unique-target-source-mapping-v2

## analysis_profile.parameters.instruction_flow_evidence

decoded-return-pcode-v1

## analysis_profile.parameters.instruction_references

exact-address-incoming-without-synthetic-entry-v2

## analysis_profile.parameters.function_boundary_observations

ghidra-function-boundary-limitations-v4

## analysis_profile.parameters.no_return_repair

returning-imports-decoded-return-v2

## analysis_profile.parameters.process_launch

inspected-jvm-launch-support-v1

## analysis_profile.parameters.jump_table_evidence

typed-case-default-blocks-v1

## analysis_profile.parameters.decompiler_jump_loads

true

## analysis_profile.parameters.loader

auto-from-header

## analysis_profile.parameters.language_id

auto-from-header

## analysis_profile.parameters.compiler_spec_id

auto-default

## analysis_profile.parameters.analyzer_preset

ghidra-default

## analysis_profile.parameters.function_coordinate_context

| Key            | Value                                                            |
|----------------|------------------------------------------------------------------|
| kind           | native-function-coordinate-context-v1                            |
| selected_image | null                                                             |
| mapping_sha256 | 55a7964dc0bcdf067484a281c658e6ca8457a49405e0ea9dbd080366ee4c3198 |

## analysis_profile.digest

386d2baf844aa0a99f1e41184098caff2a52caf228348220ca998610ff7ab4a5

## predicate_type

rea.analysis

## operation

procedure_pseudo_code

## parameters

| Key       | Value      |
|-----------|------------|
| procedure | JNI_OnLoad |

## raw_result

null

## normalized_result


undefined4 JNI_OnLoad(int *param_1)

{
  bool bVar1;
  uint uVar2;
  undefined4 uVar3;
  int iVar4;
  int iVar5;
  int iVar6;
  bool bVar7;
  undefined4 local_30;
  char cStack_27;
  char cStack_26;
  char cStack_25;
  
  uVar2 = x_131 * (x_131 + -1);
  bVar1 = y_132 < 10;
  bVar7 = ((uVar2 ^ 0xfffffffe) & uVar2) == 0;
  iVar5 = 0x59b82ffd;
LAB_0003a658:
  while (0x199c4a23 < iVar5) {
    if (iVar5 < 0x5853f0f5) {
      if (iVar5 < 0x4faa7764) {
        if (iVar5 == 0x199c4a24) goto LAB_0003a564;
        if (iVar5 == 0x4e6b024c) {
          iVar5 = -0x119803e;
          if (cStack_27 != '\0') {
            iVar5 = -0x468a349;
          }
        }
        else if (iVar5 == 0x1f64ab88) {
          return local_30;
        }
      }
      else if (iVar5 == 0x4faa7764) {
        iVar5 = 0x558ec71;
        if (cStack_26 != '\0') {
          iVar5 = 0x550a040e;
        }
      }
      else if (iVar5 == 0x550a040e) {
        uVar2 = (x_131 + -1) * x_131 & 1;
        iVar6 = 0x6ae6eadf;
        if (y_132 < 10 != (uVar2 == 0)) {
          iVar6 = 0x7175baa;
        }
        iVar5 = iVar6;
        if (uVar2 == 0) {
          iVar5 = 0x7175baa;
        }
LAB_0003a42a:
        if (9 < y_132) {
          iVar5 = iVar6;
        }
      }
    }
    else if (iVar5 < 0x651a4dbe) {
      if (iVar5 == 0x5853f0f5) {
        iVar6 = (**(code **)(*param_1 + 0x18))(param_1,&DAT_000aeb78,0x10006);
        uVar2 = (x_131 + -1) * x_131 & 1;
        iVar5 = -0x57ea0a2f;
        if (uVar2 == 0) {
          iVar5 = 0x4e6b024c;
        }
        if (9 < y_132) {
          iVar5 = -0x57ea0a2f;
        }
        if (y_132 < 10 != (uVar2 == 0)) {
          iVar5 = 0x4e6b024c;
        }
        cStack_27 = iVar6 != 0;
      }
      else if (iVar5 == 0x59b82ffd) {
        iVar5 = -0x57ea0a2f;
        if (bVar1) {
          iVar5 = 0x5853f0f5;
        }
        if (!bVar7) {
          iVar5 = -0x57ea0a2f;
        }
        if (bVar7 != bVar1) {
          iVar5 = 0x5853f0f5;
        }
      }
    }
    else if (iVar5 == 0x651a4dbe) {
      uVar2 = (x_131 + -1) * x_131;
      uVar2 = uVar2 & (uVar2 ^ 0xfffffffe);
      iVar5 = -0x1cfc26e2;
      if (uVar2 == 0) {
        iVar5 = 0x199c4a24;
      }
      if (9 < y_132) {
        iVar5 = -0x1cfc26e2;
      }
      if (y_132 < 10 != (uVar2 == 0)) {
        iVar5 = 0x199c4a24;
      }
    }
    else if (iVar5 == 0x6ae6eadf) {
      DAT_000aeb7c = (**(code **)(*DAT_000aeb78 + 0x18))(DAT_000aeb78,&DAT_000ae543);
      (**(code **)(*DAT_000aeb78 + 0x35c))(DAT_000aeb78,DAT_000aeb7c,&PTR_DAT_000ae034,4);
      iVar5 = 0x7175baa;
    }
    else if (iVar5 == 0x75a4d863) {
      iVar6 = FUN_0003a87c(DAT_000aeb78);
      uVar2 = ~-x_131 * x_131 & 1;
      iVar5 = -0x2a104a4f;
      if (uVar2 == 0) {
        iVar5 = 0x4faa7764;
      }
      if (9 < y_132) {
        iVar5 = -0x2a104a4f;
      }
      if (y_132 < 10 != (uVar2 == 0)) {
        iVar5 = 0x4faa7764;
      }
      cStack_26 = iVar6 == 0;
    }
  }
  if (iVar5 < -0x6a1a469) {
    if (-0x57ea0a30 < iVar5) {
      if (iVar5 == -0x57ea0a2f) {
        (**(code **)(*param_1 + 0x18))(param_1,&DAT_000aeb78,0x10006);
        iVar5 = 0x5853f0f5;
      }
      else if (iVar5 == -0x2a104a4f) {
        FUN_0003a87c(DAT_000aeb78);
        iVar5 = 0x75a4d863;
      }
      else if (iVar5 == -0x1cfc26e2) {
        iVar5 = 0x651a4dbe;
      }
      goto LAB_0003a658;
    }
    if (iVar5 == -0x7fe83f9d) {
      iVar5 = -0x68efa861;
      if (cStack_25 != '\0') {
        iVar5 = -0x6a1a469;
      }
      goto LAB_0003a658;
    }
    if (iVar5 != -0x68efa861) goto LAB_0003a658;
    FUN_00039f50(DAT_000aeb78);
    local_30 = 0x10006;
  }
  else {
    if (iVar5 < -0x119803e) {
      if (iVar5 != -0x6a1a469) {
        if (iVar5 == -0x468a349) {
          uVar2 = (x_131 + -1) * x_131 & 1;
          iVar5 = -0x1cfc26e2;
          if (uVar2 == 0) {
            iVar5 = 0x651a4dbe;
          }
          if (9 < y_132) {
            iVar5 = -0x1cfc26e2;
          }
          if (y_132 < 10 != (uVar2 == 0)) {
            iVar5 = 0x651a4dbe;
          }
        }
        goto LAB_0003a658;
      }
    }
    else {
      if (iVar5 == -0x119803e) {
        uVar2 = (x_131 + -1) * x_131 & 1;
        iVar5 = -0x2a104a4f;
        if (uVar2 == 0) {
          iVar5 = 0x75a4d863;
        }
        if (9 < y_132) {
          iVar5 = -0x2a104a4f;
        }
        if (y_132 < 10 != (uVar2 == 0)) {
          iVar5 = 0x75a4d863;
        }
        goto LAB_0003a658;
      }
      if (iVar5 != 0x558ec71) {
        if (iVar5 == 0x7175baa) {
          DAT_000aeb7c = (**(code **)(*DAT_000aeb78 + 0x18))(DAT_000aeb78,&DAT_000ae543);
          iVar4 = (**(code **)(*DAT_000aeb78 + 0x35c))
                            (DAT_000aeb78,DAT_000aeb7c,&PTR_DAT_000ae034,4);
          uVar2 = (x_131 + -1) * x_131 & 1;
          iVar6 = 0x6ae6eadf;
          if (y_132 < 10 != (uVar2 == 0)) {
            iVar6 = -0x7fe83f9d;
          }
          iVar5 = iVar6;
          if (uVar2 == 0) {
            iVar5 = -0x7fe83f9d;
          }
          cStack_25 = iVar4 < 0;
          goto LAB_0003a42a;
        }
        goto LAB_0003a658;
      }
      uVar3 = (**(code **)(*DAT_000aeb78 + 0x18))(DAT_000aeb78,&DAT_000ae31b);
      (**(code **)(*DAT_000aeb78 + 0x38))(DAT_000aeb78,uVar3,&DAT_000aeba1);
    }
LAB_0003a564:
    local_30 = 0xffffffff;
  }
  iVar5 = 0x1f64ab88;
  goto LAB_0003a658;
}



## confidence

observed

## authority

shipped-artifact

## environment

null

## limitations

["The session serves operations only after Ghidra reports default auto-analysis complete; incomplete analysis does not expose partial results.","The imported Program and temporary project are ephemeral and deleted on close. Annotation operations edit session database metadata; original executable bytes are never written.","Cancelling an active Ghidra request terminates its ephemeral database and discards session annotations. The selected target remains open; the next provider query imports the original artifact again.","Default-space addresses use lowercase 0x-prefixed hexadecimal; other address spaces use <percent-encoded-space>:0x<hex>.","Pseudocode is Ghidra decompiler output, not original source and not text-equivalent to Hopper output.","External functions and functions without an analyzable body return null; other decompiler failures remain explicit."]

## relationship_coverage

null

## locations

[]

## evidence_links

[]

## caller_input_path

/tmp/opencode/target/lib_eCrypt.so
