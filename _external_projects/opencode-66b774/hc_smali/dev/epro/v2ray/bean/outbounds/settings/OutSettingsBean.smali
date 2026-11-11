.class public Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public response:Ldev/epro/v2ray/bean/outbounds/settings/Response;

.field public servers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ldev/epro/v2ray/bean/outbounds/settings/ServersBean;",
            ">;"
        }
    .end annotation
.end field

.field public vnext:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ldev/epro/v2ray/bean/outbounds/settings/vnext/VnextBean;",
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
.method public getResponse()Ldev/epro/v2ray/bean/outbounds/settings/Response;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;->response:Ldev/epro/v2ray/bean/outbounds/settings/Response;

    return-object v0
.end method

.method public getServers()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldev/epro/v2ray/bean/outbounds/settings/ServersBean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;->servers:Ljava/util/List;

    return-object v0
.end method

.method public getVnext()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldev/epro/v2ray/bean/outbounds/settings/vnext/VnextBean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;->vnext:Ljava/util/List;

    return-object v0
.end method

.method public setResponse(Ldev/epro/v2ray/bean/outbounds/settings/Response;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;->response:Ldev/epro/v2ray/bean/outbounds/settings/Response;

    return-void
.end method

.method public setServers(Ljava/util/List;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldev/epro/v2ray/bean/outbounds/settings/ServersBean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;->servers:Ljava/util/List;

    return-void
.end method

.method public setVnext(Ljava/util/List;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldev/epro/v2ray/bean/outbounds/settings/vnext/VnextBean;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;->vnext:Ljava/util/List;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    const-string v0, "OutSettingsBean{vnext="

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;->vnext:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", servers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;->servers:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", response="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/bean/outbounds/settings/OutSettingsBean;->response:Ldev/epro/v2ray/bean/outbounds/settings/Response;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
