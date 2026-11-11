.class public Ldev/epro/v2ray/model/policy/PolicyObject;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public levels:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ldev/epro/v2ray/model/policy/LevelPolicyObject;",
            ">;"
        }
    .end annotation
.end field

.field public system:Ldev/epro/v2ray/model/policy/SystemPolicyObject;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getLevels()Ljava/util/Map;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ldev/epro/v2ray/model/policy/LevelPolicyObject;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ldev/epro/v2ray/model/policy/PolicyObject;->levels:Ljava/util/Map;

    return-object v0
.end method

.method public getSystem()Ldev/epro/v2ray/model/policy/SystemPolicyObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/policy/PolicyObject;->system:Ldev/epro/v2ray/model/policy/SystemPolicyObject;

    return-object v0
.end method

.method public setLevels(Ljava/util/Map;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ldev/epro/v2ray/model/policy/LevelPolicyObject;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldev/epro/v2ray/model/policy/PolicyObject;->levels:Ljava/util/Map;

    return-void
.end method

.method public setSystem(Ldev/epro/v2ray/model/policy/SystemPolicyObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/policy/PolicyObject;->system:Ldev/epro/v2ray/model/policy/SystemPolicyObject;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    const-string v0, "PolicyObject{levels="

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/model/policy/PolicyObject;->levels:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", system="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/policy/PolicyObject;->system:Ldev/epro/v2ray/model/policy/SystemPolicyObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
