import logging
logging.disable(logging.CRITICAL)
from androguard.core.dex import DEX
dex=DEX(open("/home/hatch/workspace/axis-koin/reverse-latest/fase3/tmp14169616706995394833.dex",'rb').read())
fids=dex.get_fields()
for c in dex.get_classes():
    if c.get_name()=="Ld6/a;":
        adi=c.annotations_directory_item
        for fa in adi.get_field_annotations():
            f=fids[fa.get_field_idx()]
            asi=dex.CM.get_annotation_set_item(fa.get_annotations_off())
            print("FIELD", f.get_name())
            for off in asi.get_annotation_off_item():
                ann=off.get_annotation_item().get_annotation()
                print("   ", dex.CM.get_type(ann.get_type_idx()), [(dex.CM.get_string(el.get_name_idx()), el.get_value().get_value()) for el in ann.get_elements()])
        break
print("done")
