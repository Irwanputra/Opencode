## evidence_id

ev_5cf3f7efd3d02aa4aa99d6dfa0b2c1a6f7c9a7fdce78faeffed8de5e9075c174

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

| Key     | Value                               |
|---------|-------------------------------------|
| id      | rea-workflow                        |
| name    | REA composed investigation workflow |
| version | 1                                   |

## analysis_profile.provider

| Key     | Value                               |
|---------|-------------------------------------|
| id      | rea-workflow                        |
| name    | REA composed investigation workflow |
| version | 1                                   |

## analysis_profile.parameters.upstream_analysis_profile.provider

| Key     | Value  |
|---------|--------|
| id      | ghidra |
| name    | Ghidra |
| version | 12.2   |

## analysis_profile.parameters.upstream_analysis_profile.parameters.target_kind

executable

## analysis_profile.parameters.upstream_analysis_profile.parameters.target_format

elf

## analysis_profile.parameters.upstream_analysis_profile.parameters.architecture

arm64

## analysis_profile.parameters.upstream_analysis_profile.parameters.available_architectures

\["arm64"\]

## analysis_profile.parameters.upstream_analysis_profile.parameters.import_mode

ephemeral-source-immutable

## analysis_profile.parameters.upstream_analysis_profile.parameters.producer

| Key            | Value                                                            |
|----------------|------------------------------------------------------------------|
| rea_version    | 6.10.1                                                           |
| sources_sha256 | 2acc01df6e538ba5171b72dc8d8b1752a57b3dacd670979ea84a07661bd7ef1f |

## analysis_profile.parameters.upstream_analysis_profile.parameters.annotation_policy

atomic-function-entry-metadata

## analysis_profile.parameters.upstream_analysis_profile.parameters.loader_relocation_semantics

volatile-unapplied-relocation-destinations

## analysis_profile.parameters.upstream_analysis_profile.parameters.no_return_repair

returning-imports-decoded-return

## analysis_profile.parameters.upstream_analysis_profile.parameters.process_launch

inspected-jvm-launch-support

## analysis_profile.parameters.upstream_analysis_profile.parameters.decompiler_jump_loads

true

## analysis_profile.parameters.upstream_analysis_profile.parameters.loader

auto-from-header

## analysis_profile.parameters.upstream_analysis_profile.parameters.language_id

auto-from-header

## analysis_profile.parameters.upstream_analysis_profile.parameters.compiler_spec_id

auto-default

## analysis_profile.parameters.upstream_analysis_profile.parameters.analyzer_preset

ghidra-default

## analysis_profile.parameters.upstream_analysis_profile.parameters.function_coordinate_context

| Key            | Value                                                            |
|----------------|------------------------------------------------------------------|
| kind           | native-function-coordinate-context-v1                            |
| selected_image | null                                                             |
| mapping_sha256 | 55a7964dc0bcdf067484a281c658e6ca8457a49405e0ea9dbd080366ee4c3198 |

## analysis_profile.parameters.upstream_analysis_profile.digest

79602b89f8253ac84d6848c27fc714a3c3601db30a96e32605d504127feed1a8

## analysis_profile.parameters.source_limitations

provider-operation-caveats-v1

## analysis_profile.parameters.workflow_revision

5

## analysis_profile.digest

58f3eeb12480fca8b9fab644ffb7be8a1c3364aa0c75099fe9e1822a22176a50

## predicate_type

rea.analysis

## operation

binary_overview

## parameters

| Key | Value |
|-----|-------|

## caller_input_path

w815lib/lib/arm64-v8a/libcodec.so

## raw_result

null

## normalized_result.document

target-9631ae440271.so

## normalized_result.image_base

0x100000

## normalized_result.segments

| name                | start                       | end                           | length | image_base | address_space       |
|---------------------|-----------------------------|-------------------------------|--------|------------|---------------------|
| segment_1.1         | 0x100000                    | 0x100238                      | 568    | 0x100000   | ram                 |
| .note.android.ident | 0x100238                    | 0x1002d0                      | 152    | 0x100000   | ram                 |
| .dynsym             | 0x1002d0                    | 0x1003f0                      | 288    | 0x100000   | ram                 |
| .gnu.version        | 0x1003f0                    | 0x100408                      | 24     | 0x100000   | ram                 |
| .gnu.version_r      | 0x100408                    | 0x100428                      | 32     | 0x100000   | ram                 |
| .gnu.hash           | 0x100428                    | 0x100448                      | 32     | 0x100000   | ram                 |
| .dynstr             | 0x100448                    | 0x1004fb                      | 179    | 0x100000   | ram                 |
| .rela.dyn           | 0x100500                    | 0x100b90                      | 1680   | 0x100000   | ram                 |
| .rela.plt           | 0x100b90                    | 0x100c68                      | 216    | 0x100000   | ram                 |
| .rodata             | 0x100c70                    | 0x101083                      | 1043   | 0x100000   | ram                 |
| .eh_frame_hdr       | 0x101084                    | 0x101148                      | 196    | 0x100000   | ram                 |
| .eh_frame           | 0x101148                    | 0x10155c                      | 1044   | 0x100000   | ram                 |
| .text               | 0x101560                    | 0x11a140                      | 101344 | 0x100000   | ram                 |
| .plt                | 0x11a140                    | 0x11a1f0                      | 176    | 0x100000   | ram                 |
| .data.rel.ro        | 0x11e1f0                    | 0x11e3f0                      | 512    | 0x100000   | ram                 |
| .fini_array         | 0x11e3f0                    | 0x11e400                      | 16     | 0x100000   | ram                 |
| .init_array         | 0x11e400                    | 0x11e418                      | 24     | 0x100000   | ram                 |
| .dynamic            | 0x11e418                    | 0x11e5c8                      | 432    | 0x100000   | ram                 |
| .got                | 0x11e5c8                    | 0x11e5e0                      | 24     | 0x100000   | ram                 |
| .got.plt            | 0x11e5e0                    | 0x11e640                      | 96     | 0x100000   | ram                 |
| .relro_padding      | 0x11e640                    | 0x11f000                      | 2496   | 0x100000   | ram                 |
| .data               | 0x122640                    | 0x122644                      | 4      | 0x100000   | ram                 |
| .bss                | 0x122648                    | 0x1226a8                      | 96     | 0x100000   | ram                 |
| EXTERNAL            | 0x123000                    | 0x123050                      | 80     | 0x100000   | ram                 |
| .shstrtab           | .shstrtab&#58;0x0           | .shstrtab&#58;0xe5            | 229    | 0x100000   | .shstrtab           |
| \_elfSectionHeaders | \_elfSectionHeaders&#58;0x0 | \_elfSectionHeaders&#58;0x600 | 1536   | 0x100000   | \_elfSectionHeaders |

## normalized_result.segment_count

26

## normalized_result.procedure_count

51

## normalized_result.string_count

41

## normalized_result.inventory_coverage

| Key                | Value              |
|--------------------|--------------------|
| scope              | provider_inventory |
| discovery_coverage | unknown            |

## confidence

derived

## authority

shipped-artifact

## environment

null

## limitations

\["Derived by an REA composed workflow.","Ghidra (ghidra 12.2) read_binary_inventory_summary&#58; Cancelling an active Ghidra request terminates its ephemeral database and discards session annotations. The selected target remains open; the next provider query imports the original artifact again.","Ghidra (ghidra 12.2) read_binary_inventory_summary&#58; Counts use the complete defined-string inventory and the same local/external function inventory as list_strings and list_procedures. They do not establish discovery of undefined strings or unidentified functions.","Ghidra (ghidra 12.2) read_binary_inventory_summary&#58; Default-space addresses use lowercase 0x-prefixed hexadecimal; other address spaces use &lt;percent-encoded-space&gt;&#58;0x&lt;hex&gt;.","Ghidra (ghidra 12.2) read_binary_inventory_summary&#58; Ghidra Program checkpoint mode is disabled&#58; closing discards metadata edits; original executable bytes are unchanged. For stock ELF/PE/Mach-O on Linux/macOS, set REA_GHIDRA_CHECKPOINT_DIR to a private absolute directory before starting REA (restart MCP after changing its startup environment).","Ghidra (ghidra 12.2) read_binary_inventory_summary&#58; Known provider defect ghidra-10154 (jump-table-unrecovered-function-truncated)&#58; Ghidra 12.2 leaves an aarch64 switch unrecovered when it is a byte-offset bounded by and-0xff. The function body stops at the indirect branch. Upstream issue https&#58;//github.com/NationalSecurityAgency/ghidra/issues/10154 is open and names a Swift -O swift-enum switch; it has no fix commit and no milestone. REA reproduced the unrecovered jump table on the exact 12.2 build with an AArch64 ELF object of that instruction shape. A compare-bounded byte table still recovers. This record stays on every admitted build until a release is known to clear it.","Ghidra (ghidra 12.2) read_binary_inventory_summary&#58; Known provider defect ghidra-9996 (jump-table-flow-references-omitted)&#58; Ghidra 12.2 can omit jump-table flow references and emit incorrect decompiler output for clang -O0 x86-64 switches whose case labels start above zero. Upstream issue https&#58;//github.com/NationalSecurityAgency/ghidra/issues/9996 is closed by c93917a622211349998f641de54cfdbe0e0e5bee, milestone 12.2.1, which is not yet released. This limitation is recorded for parsed 12.2 releases whose patch is below 12.2.1, including a zero patch and a suffix, and clears on 12.2.1. REA's verified switch lane compiles with -O2 and does not cover this shape.","Ghidra (ghidra 12.2) read_binary_inventory_summary&#58; Memory-block end addresses are exclusive; segment lengths use those observed address coordinates.","Ghidra (ghidra 12.2) read_binary_inventory_summary&#58; Only Ghidra-defined string Data is observed; packed or undefined string bytes may be absent. Completeness applies to that inventory, and an empty search does not establish that text is absent from the artifact. If an address is known, use read_bytes and xrefs to inspect bytes and references.","Ghidra (ghidra 12.2) read_binary_inventory_summary&#58; The session serves operations only after Ghidra reports default auto-analysis complete; incomplete analysis does not expose partial results."\]

## relationship_coverage

null

## locations

\[\]

## evidence_links

\["ev_8c28f749b693fae7797315e8e6b3cb34cc7de780ad4f5dff7b0603cc038c26cb"\]
