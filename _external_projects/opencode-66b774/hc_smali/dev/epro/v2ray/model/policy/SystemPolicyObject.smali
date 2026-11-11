.class public Ldev/epro/v2ray/model/policy/SystemPolicyObject;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public statsInboundDownlink:Z

.field public statsInboundUplink:Z

.field public statsOutboundDownlink:Z

.field public statsOutboundUplink:Z


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getStatsInboundDownlink()Z
    .registers 2

    iget-boolean v0, p0, Ldev/epro/v2ray/model/policy/SystemPolicyObject;->statsInboundDownlink:Z

    return v0
.end method

.method public getStatsInboundUplink()Z
    .registers 2

    iget-boolean v0, p0, Ldev/epro/v2ray/model/policy/SystemPolicyObject;->statsInboundUplink:Z

    return v0
.end method

.method public getStatsOutboundDownlink()Z
    .registers 2

    iget-boolean v0, p0, Ldev/epro/v2ray/model/policy/SystemPolicyObject;->statsOutboundDownlink:Z

    return v0
.end method

.method public getStatsOutboundUplink()Z
    .registers 2

    iget-boolean v0, p0, Ldev/epro/v2ray/model/policy/SystemPolicyObject;->statsOutboundUplink:Z

    return v0
.end method

.method public setStatsInboundDownlink(Z)V
    .registers 2

    iput-boolean p1, p0, Ldev/epro/v2ray/model/policy/SystemPolicyObject;->statsInboundDownlink:Z

    return-void
.end method

.method public setStatsInboundUplink(Z)V
    .registers 2

    iput-boolean p1, p0, Ldev/epro/v2ray/model/policy/SystemPolicyObject;->statsInboundUplink:Z

    return-void
.end method

.method public setStatsOutboundDownlink(Z)V
    .registers 2

    iput-boolean p1, p0, Ldev/epro/v2ray/model/policy/SystemPolicyObject;->statsOutboundDownlink:Z

    return-void
.end method

.method public setStatsOutboundUplink(Z)V
    .registers 2

    iput-boolean p1, p0, Ldev/epro/v2ray/model/policy/SystemPolicyObject;->statsOutboundUplink:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    const-string v0, "SystemPolicyObject{statsInboundUplink="

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Ldev/epro/v2ray/model/policy/SystemPolicyObject;->statsInboundUplink:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", statsInboundDownlink="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ldev/epro/v2ray/model/policy/SystemPolicyObject;->statsInboundDownlink:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", statsOutboundUplink="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ldev/epro/v2ray/model/policy/SystemPolicyObject;->statsOutboundUplink:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", statsOutboundDownlink="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ldev/epro/v2ray/model/policy/SystemPolicyObject;->statsOutboundDownlink:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
