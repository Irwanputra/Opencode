## evidence_id

ev_e293d1bdc601635b25ce530825a20e4d8b8ffd7cfacba616d1ff8776bbb32294

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
| version | 12.1.4 |

## analysis_profile.parameters.upstream_analysis_profile.parameters.target_kind

executable

## analysis_profile.parameters.upstream_analysis_profile.parameters.target_format

elf

## analysis_profile.parameters.upstream_analysis_profile.parameters.architecture

arm

## analysis_profile.parameters.upstream_analysis_profile.parameters.available_architectures

["arm"]

## analysis_profile.parameters.upstream_analysis_profile.parameters.import_mode

ephemeral-source-immutable

## analysis_profile.parameters.upstream_analysis_profile.parameters.annotation_policy

atomic-function-entry-metadata-v1

## analysis_profile.parameters.upstream_analysis_profile.parameters.load_image_observations

source-mappings-entry-context-v2

## analysis_profile.parameters.upstream_analysis_profile.parameters.function_body_evidence

complete-inclusive-ranges-v1

## analysis_profile.parameters.upstream_analysis_profile.parameters.function_references

complete-body-and-entry-reference-manager-v2

## analysis_profile.parameters.upstream_analysis_profile.parameters.call_relationship_coverage

function-body-call-coverage-v5

## analysis_profile.parameters.upstream_analysis_profile.parameters.function_dossier_coverage

observed-facets-and-call-relationships-v1

## analysis_profile.parameters.upstream_analysis_profile.parameters.string_inventory_evidence

defined-data-coverage-v1

## analysis_profile.parameters.upstream_analysis_profile.parameters.location_resolution

explicit-address-exact-entry-symbol-first-v3

## analysis_profile.parameters.upstream_analysis_profile.parameters.procedure_file_offset_resolution

address-first-unique-target-source-mapping-v2

## analysis_profile.parameters.upstream_analysis_profile.parameters.instruction_flow_evidence

decoded-return-pcode-v1

## analysis_profile.parameters.upstream_analysis_profile.parameters.instruction_references

exact-address-incoming-without-synthetic-entry-v2

## analysis_profile.parameters.upstream_analysis_profile.parameters.function_boundary_observations

ghidra-function-boundary-limitations-v4

## analysis_profile.parameters.upstream_analysis_profile.parameters.no_return_repair

returning-imports-decoded-return-v2

## analysis_profile.parameters.upstream_analysis_profile.parameters.process_launch

inspected-jvm-launch-support-v1

## analysis_profile.parameters.upstream_analysis_profile.parameters.jump_table_evidence

typed-case-default-blocks-v1

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

386d2baf844aa0a99f1e41184098caff2a52caf228348220ca998610ff7ab4a5

## analysis_profile.parameters.source_limitations

provider-operation-caveats-v1

## analysis_profile.parameters.workflow_revision

4

## analysis_profile.digest

7ff84a50fbfa5c957e3cbcf880c13e50f1167c60704dfb55e0abddbc53079708

## predicate_type

rea.analysis

## operation

binary_overview

## parameters

| Key | Value |
|-----|-------|

## raw_result

null

## normalized_result.document

target-c8f8b88a67a9.so

## normalized_result.image_base

0x10000

## normalized_result.segments

| name                   | start                      | end                         | length | image_base | address_space          |
|------------------------|----------------------------|-----------------------------|--------|------------|------------------------|
| segment_1.1            | 0x10000                    | 0x10134                     | 308    | 0x10000    | ram                    |
| .note.android.ident    | 0x10134                    | 0x101cc                     | 152    | 0x10000    | ram                    |
| .note.gnu.build-id     | 0x101cc                    | 0x101f0                     | 36     | 0x10000    | ram                    |
| .dynsym                | 0x101f0                    | 0x117a0                     | 5552   | 0x10000    | ram                    |
| .dynstr                | 0x117a0                    | 0x12389                     | 3049   | 0x10000    | ram                    |
| .hash                  | 0x1238c                    | 0x12d1c                     | 2448   | 0x10000    | ram                    |
| .gnu.version           | 0x12d1c                    | 0x12fd2                     | 694    | 0x10000    | ram                    |
| .gnu.version_d         | 0x12fd4                    | 0x12ff0                     | 28     | 0x10000    | ram                    |
| .gnu.version_r         | 0x12ff0                    | 0x13010                     | 32     | 0x10000    | ram                    |
| .rel.dyn               | 0x13010                    | 0x139c0                     | 2480   | 0x10000    | ram                    |
| .rel.plt               | 0x139c0                    | 0x13c70                     | 688    | 0x10000    | ram                    |
| .plt                   | 0x13c70                    | 0x1408c                     | 1052   | 0x10000    | ram                    |
| .text                  | 0x1408c                    | 0xa9598                     | 611596 | 0x10000    | ram                    |
| .ARM.extab             | 0xa9598                    | 0xaa30c                     | 3444   | 0x10000    | ram                    |
| .ARM.exidx             | 0xaa30c                    | 0xaaf7c                     | 3184   | 0x10000    | ram                    |
| .rodata                | 0xaaf80                    | 0xac87e                     | 6398   | 0x10000    | ram                    |
| .fini_array            | 0xad9c0                    | 0xad9c4                     | 4      | 0x10000    | ram                    |
| .init_array            | 0xad9c4                    | 0xad9d4                     | 16     | 0x10000    | ram                    |
| .data.rel.ro           | 0xad9d8                    | 0xada84                     | 172    | 0x10000    | ram                    |
| .dynamic               | 0xada84                    | 0xadbac                     | 296    | 0x10000    | ram                    |
| .got                   | 0xadbb0                    | 0xae000                     | 1104   | 0x10000    | ram                    |
| .data                  | 0xae000                    | 0xaeb74                     | 2932   | 0x10000    | ram                    |
| .bss                   | 0xaeb74                    | 0xaef60                     | 1004   | 0x10000    | ram                    |
| EXTERNAL               | 0xaf000                    | 0xaf14c                     | 332    | 0x10000    | ram                    |
| .ARM.attributes        | .ARM.attributes:0x0        | .ARM.attributes:0x36        | 54     | 0x10000    | .ARM.attributes        |
| .note.gnu.gold-version | .note.gnu.gold-version:0x0 | .note.gnu.gold-version:0x1c | 28     | 0x10000    | .note.gnu.gold-version |
| .shstrtab              | .shstrtab:0x0              | .shstrtab:0x10e             | 270    | 0x10000    | .shstrtab              |
| \_elfSectionHeaders    | \_elfSectionHeaders:0x0    | \_elfSectionHeaders:0x410   | 1040   | 0x10000    | \_elfSectionHeaders    |

## normalized_result.segment_count

28

## normalized_result.procedure_count

585

## normalized_result.string_count

414

## confidence

derived

## authority

shipped-artifact

## environment

null

## limitations

["Derived by an REA composed workflow.","Ghidra (ghidra 12.1.4) read_binary_inventory_summary: Cancelling an active Ghidra request terminates its ephemeral database and discards session annotations. The selected target remains open; the next provider query imports the original artifact again.","Ghidra (ghidra 12.1.4) read_binary_inventory_summary: Counts use the complete defined-string inventory and the same local/external function inventory as list_strings and list_procedures. They do not establish discovery of undefined strings or unidentified functions.","Ghidra (ghidra 12.1.4) read_binary_inventory_summary: Default-space addresses use lowercase 0x-prefixed hexadecimal; other address spaces use <percent-encoded-space>:0x<hex>.","Ghidra (ghidra 12.1.4) read_binary_inventory_summary: Memory-block end addresses are exclusive; segment lengths use those observed address coordinates.","Ghidra (ghidra 12.1.4) read_binary_inventory_summary: Only Ghidra-defined string Data is observed; packed or undefined string bytes may be absent. Completeness applies to that inventory, and an empty search does not establish that text is absent from the artifact. If an address is known, use read_bytes and xrefs to inspect bytes and references.","Ghidra (ghidra 12.1.4) read_binary_inventory_summary: The imported Program and temporary project are ephemeral and deleted on close. Annotation operations edit session database metadata; original executable bytes are never written.","Ghidra (ghidra 12.1.4) read_binary_inventory_summary: The session serves operations only after Ghidra reports default auto-analysis complete; incomplete analysis does not expose partial results."]

## relationship_coverage

null

## locations

[]

## evidence_links

["ev_d5bb27d0bca9bba991c40f189ba09659d1d92ef804f940aa5edf9454f92698b0"]

## caller_input_path

/tmp/opencode/target/lib_eCrypt.so
