## evidence_id

ev_343d5bc76b1a0d75e2a9b2b41fa5ecf1e96edd1efc7752b8b1afaf95cbe2b258

## evidence_format

2

## subject.identity

| Key          | Value                                                            |
|--------------|------------------------------------------------------------------|
| kind         | file                                                             |
| sha256       | 9631ae440271335c6cd9049f55ecd06f9888a780a496a890ab5e29f8dd3755d4 |
| selection    | null                                                             |
| format       | elf                                                              |
| architecture | arm64                                                            |

## subject.name

libcodec.so

## subject.local_path

/home/runner/work/Opencode/Opencode/\_external_projects/opencode-66b774/w815lib/lib/arm64-v8a/libcodec.so

## provider

| Key     | Value  |
|---------|--------|
| id      | ghidra |
| name    | Ghidra |
| version | 12.2   |

## analysis_profile.provider

| Key     | Value  |
|---------|--------|
| id      | ghidra |
| name    | Ghidra |
| version | 12.2   |

## analysis_profile.parameters.target_kind

executable

## analysis_profile.parameters.target_format

elf

## analysis_profile.parameters.architecture

arm64

## analysis_profile.parameters.available_architectures

\["arm64"\]

## analysis_profile.parameters.import_mode

ephemeral-source-immutable

## analysis_profile.parameters.producer

| Key            | Value                                                            |
|----------------|------------------------------------------------------------------|
| rea_version    | 6.10.1                                                           |
| sources_sha256 | 2acc01df6e538ba5171b72dc8d8b1752a57b3dacd670979ea84a07661bd7ef1f |

## analysis_profile.parameters.annotation_policy

atomic-function-entry-metadata

## analysis_profile.parameters.loader_relocation_semantics

volatile-unapplied-relocation-destinations

## analysis_profile.parameters.no_return_repair

returning-imports-decoded-return

## analysis_profile.parameters.process_launch

inspected-jvm-launch-support

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

## analysis_profile.parameters.analysis_seeds.format

rea-ghidra-seeds-v1

## analysis_profile.parameters.analysis_seeds.path

/tmp/rea_seeds.txt

## analysis_profile.parameters.analysis_seeds.configured_path

/tmp/rea_seeds.txt

## analysis_profile.parameters.analysis_seeds.sha256

879f18d507ef64d94b55df6dcd162e15e67155be20312e4f487c80d07841ca29

## analysis_profile.parameters.analysis_seeds.entries

| Key      | Value |
|----------|-------|
| function | 1     |
| code     | 0     |
| label    | 0     |

## analysis_profile.digest

9b73b1e77ed007d7df56354facb76b8a833229702da054ddee2110f9e1f423d8

## predicate_type

rea.analysis

## operation

procedure_pseudo_code

## parameters

| Key       | Value                  |
|-----------|------------------------|
| procedure | file-offset&#58;0x3174 |

## caller_input_path

w815lib/lib/arm64-v8a/libcodec.so

## raw_result.value

<br>void HcrTransform(void)<br><br>\{<br>  (\*(code \*)&amp;LAB_00103184)();<br>  return;<br>\}<br><br>

## raw_result.limitations

\[\]

## raw_result.selection

| Key               | Value    |
|-------------------|----------|
| file_offset       | 12660    |
| mapped_address    | 0x103174 |
| procedure_address | 0x103174 |

## normalized_result

<br>void HcrTransform(void)<br><br>\{<br>  (\*(code \*)&amp;LAB_00103184)();<br>  return;<br>\}<br><br>

## confidence

observed

## authority

shipped-artifact

## environment

null

## limitations

\["The session serves operations only after Ghidra reports default auto-analysis complete; incomplete analysis does not expose partial results.","Ghidra Program checkpoint mode is disabled&#58; closing discards metadata edits; original executable bytes are unchanged. For stock ELF/PE/Mach-O on Linux/macOS, set REA_GHIDRA_CHECKPOINT_DIR to a private absolute directory before starting REA (restart MCP after changing its startup environment).","Cancelling an active Ghidra request terminates its ephemeral database and discards session annotations. The selected target remains open; the next provider query imports the original artifact again.","Default-space addresses use lowercase 0x-prefixed hexadecimal; other address spaces use &lt;percent-encoded-space&gt;&#58;0x&lt;hex&gt;.","Pseudocode is Ghidra decompiler output, not original source and not text-equivalent to Hopper output.","External functions and functions without an analyzable body return null; other decompiler failures remain explicit.","Ghidra analysis was seeded before auto-analysis from /tmp/rea_seeds.txt (sha256 879f18d507ef64d94b55df6dcd162e15e67155be20312e4f487c80d07841ca29&#58; 1 function, 0 code, 0 label entries). Seeded functions, code and names are caller assertions, not Ghidra discoveries.","Seed outcome&#58; 1 functions created, 0 already present, 0 failed; 0 code seeds decoded, 0 failed; 0 labels applied, 0 failed; 0 seeds outside initialized memory.","Known provider defect ghidra-9996 (jump-table-flow-references-omitted)&#58; Ghidra 12.2 can omit jump-table flow references and emit incorrect decompiler output for clang -O0 x86-64 switches whose case labels start above zero. Upstream issue https&#58;//github.com/NationalSecurityAgency/ghidra/issues/9996 is closed by c93917a622211349998f641de54cfdbe0e0e5bee, milestone 12.2.1, which is not yet released. This limitation is recorded for parsed 12.2 releases whose patch is below 12.2.1, including a zero patch and a suffix, and clears on 12.2.1. REA's verified switch lane compiles with -O2 and does not cover this shape.","Known provider defect ghidra-10154 (jump-table-unrecovered-function-truncated)&#58; Ghidra 12.2 leaves an aarch64 switch unrecovered when it is a byte-offset bounded by and-0xff. The function body stops at the indirect branch. Upstream issue https&#58;//github.com/NationalSecurityAgency/ghidra/issues/10154 is open and names a Swift -O swift-enum switch; it has no fix commit and no milestone. REA reproduced the unrecovered jump table on the exact 12.2 build with an AArch64 ELF object of that instruction shape. A compare-bounded byte table still recovers. This record stays on every admitted build until a release is known to clear it."\]

## relationship_coverage

null

## locations

| kind        | offset | address  |
|-------------|--------|----------|
| file-offset | 12660  |          |
| address     |        | 0x103174 |
| address     |        | 0x103174 |

## evidence_links

\[\]
