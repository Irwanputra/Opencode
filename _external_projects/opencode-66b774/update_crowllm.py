import json

CFG = "/home/runner/.config/opencode/opencode.json"
MODELS = "/tmp/opencode/crowllm-models.json"

with open(MODELS) as f:
    data = json.load(f)["data"]

free = sorted(m["id"] for m in data if m["id"].endswith(":free"))
paid = [m["id"] for m in data if not m["id"].endswith(":free")]

with open(CFG) as f:
    cfg = json.load(f)

cfg["providers"]["crowllm"]["models"] = {
    mid: {"name": mid[: -len(":free")]} for mid in free
}

with open(CFG, "w") as f:
    json.dump(cfg, f, indent=2, ensure_ascii=False)
    f.write("\n")

print("free models added:", len(free))
print("skipped (not free):", paid)
