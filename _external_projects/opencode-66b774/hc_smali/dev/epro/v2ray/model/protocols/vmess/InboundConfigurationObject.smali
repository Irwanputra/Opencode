.class public Ldev/epro/v2ray/model/protocols/vmess/InboundConfigurationObject;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public clients:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ldev/epro/v2ray/model/protocols/vmess/ClientObject;",
            ">;"
        }
    .end annotation
.end field

.field public defaultObject:Ldev/epro/v2ray/model/protocols/vmess/DefaultObject;
    .annotation runtime Lなぎぱいぢぎ/なぎぱいぢぎ/くし〴〺ぅ/ぅみぱぎぎ/〺つふすそ;
        value = "default"
    .end annotation
.end field

.field public detour:Ldev/epro/v2ray/model/protocols/vmess/DetourObject;

.field public disableInsecureEncryption:Z


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getClients()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldev/epro/v2ray/model/protocols/vmess/ClientObject;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ldev/epro/v2ray/model/protocols/vmess/InboundConfigurationObject;->clients:Ljava/util/List;

    return-object v0
.end method

.method public getDefaultObject()Ldev/epro/v2ray/model/protocols/vmess/DefaultObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/protocols/vmess/InboundConfigurationObject;->defaultObject:Ldev/epro/v2ray/model/protocols/vmess/DefaultObject;

    return-object v0
.end method

.method public getDetour()Ldev/epro/v2ray/model/protocols/vmess/DetourObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/protocols/vmess/InboundConfigurationObject;->detour:Ldev/epro/v2ray/model/protocols/vmess/DetourObject;

    return-object v0
.end method

.method public getDisableInsecureEncryption()Z
    .registers 2

    iget-boolean v0, p0, Ldev/epro/v2ray/model/protocols/vmess/InboundConfigurationObject;->disableInsecureEncryption:Z

    return v0
.end method

.method public setClients(Ljava/util/List;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldev/epro/v2ray/model/protocols/vmess/ClientObject;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldev/epro/v2ray/model/protocols/vmess/InboundConfigurationObject;->clients:Ljava/util/List;

    return-void
.end method

.method public setDefaultObject(Ldev/epro/v2ray/model/protocols/vmess/DefaultObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/protocols/vmess/InboundConfigurationObject;->defaultObject:Ldev/epro/v2ray/model/protocols/vmess/DefaultObject;

    return-void
.end method

.method public setDetour(Ldev/epro/v2ray/model/protocols/vmess/DetourObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/protocols/vmess/InboundConfigurationObject;->detour:Ldev/epro/v2ray/model/protocols/vmess/DetourObject;

    return-void
.end method

.method public setDisableInsecureEncryption(Z)V
    .registers 2

    iput-boolean p1, p0, Ldev/epro/v2ray/model/protocols/vmess/InboundConfigurationObject;->disableInsecureEncryption:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    const-string v0, "InboundConfigurationObject{clients="

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/model/protocols/vmess/InboundConfigurationObject;->clients:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", detour="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/protocols/vmess/InboundConfigurationObject;->detour:Ldev/epro/v2ray/model/protocols/vmess/DetourObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", defaultObject="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/protocols/vmess/InboundConfigurationObject;->defaultObject:Ldev/epro/v2ray/model/protocols/vmess/DefaultObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", disableInsecureEncryption="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ldev/epro/v2ray/model/protocols/vmess/InboundConfigurationObject;->disableInsecureEncryption:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
