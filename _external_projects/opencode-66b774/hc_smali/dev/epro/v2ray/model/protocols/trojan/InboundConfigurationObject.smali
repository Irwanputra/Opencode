.class public Ldev/epro/v2ray/model/protocols/trojan/InboundConfigurationObject;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public clients:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ldev/epro/v2ray/model/protocols/trojan/ClientObject;",
            ">;"
        }
    .end annotation
.end field

.field public fallbacks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ldev/epro/v2ray/model/protocols/trojan/FallbackObject;",
            ">;"
        }
    .end annotation
.end field


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
            "Ldev/epro/v2ray/model/protocols/trojan/ClientObject;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ldev/epro/v2ray/model/protocols/trojan/InboundConfigurationObject;->clients:Ljava/util/List;

    return-object v0
.end method

.method public getFallbacks()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldev/epro/v2ray/model/protocols/trojan/FallbackObject;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ldev/epro/v2ray/model/protocols/trojan/InboundConfigurationObject;->fallbacks:Ljava/util/List;

    return-object v0
.end method

.method public setClients(Ljava/util/List;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldev/epro/v2ray/model/protocols/trojan/ClientObject;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldev/epro/v2ray/model/protocols/trojan/InboundConfigurationObject;->clients:Ljava/util/List;

    return-void
.end method

.method public setFallbacks(Ljava/util/List;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldev/epro/v2ray/model/protocols/trojan/FallbackObject;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldev/epro/v2ray/model/protocols/trojan/InboundConfigurationObject;->fallbacks:Ljava/util/List;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    const-string v0, "InboundConfigurationObject{clients="

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/model/protocols/trojan/InboundConfigurationObject;->clients:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fallbacks="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/protocols/trojan/InboundConfigurationObject;->fallbacks:Ljava/util/List;

    const/16 v2, 0x7d

    invoke-static {v0, v1, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぁごぐすすぃ(Ljava/lang/StringBuilder;Ljava/util/List;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
