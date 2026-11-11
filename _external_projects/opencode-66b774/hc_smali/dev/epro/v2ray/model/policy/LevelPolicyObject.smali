.class public Ldev/epro/v2ray/model/policy/LevelPolicyObject;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public bufferSize:I

.field public connIdle:I

.field public downlinkOnly:I

.field public handshake:I

.field public statsUserDownlink:Z

.field public statsUserUplink:Z

.field public uplinkOnly:I


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBufferSize()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/model/policy/LevelPolicyObject;->bufferSize:I

    return v0
.end method

.method public getConnIdle()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/model/policy/LevelPolicyObject;->connIdle:I

    return v0
.end method

.method public getDownlinkOnly()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/model/policy/LevelPolicyObject;->downlinkOnly:I

    return v0
.end method

.method public getHandshake()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/model/policy/LevelPolicyObject;->handshake:I

    return v0
.end method

.method public getStatsUserDownlink()Z
    .registers 2

    iget-boolean v0, p0, Ldev/epro/v2ray/model/policy/LevelPolicyObject;->statsUserDownlink:Z

    return v0
.end method

.method public getStatsUserUplink()Z
    .registers 2

    iget-boolean v0, p0, Ldev/epro/v2ray/model/policy/LevelPolicyObject;->statsUserUplink:Z

    return v0
.end method

.method public getUplinkOnly()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/model/policy/LevelPolicyObject;->uplinkOnly:I

    return v0
.end method

.method public setBufferSize(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/model/policy/LevelPolicyObject;->bufferSize:I

    return-void
.end method

.method public setConnIdle(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/model/policy/LevelPolicyObject;->connIdle:I

    return-void
.end method

.method public setDownlinkOnly(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/model/policy/LevelPolicyObject;->downlinkOnly:I

    return-void
.end method

.method public setHandshake(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/model/policy/LevelPolicyObject;->handshake:I

    return-void
.end method

.method public setStatsUserDownlink(Z)V
    .registers 2

    iput-boolean p1, p0, Ldev/epro/v2ray/model/policy/LevelPolicyObject;->statsUserDownlink:Z

    return-void
.end method

.method public setStatsUserUplink(Z)V
    .registers 2

    iput-boolean p1, p0, Ldev/epro/v2ray/model/policy/LevelPolicyObject;->statsUserUplink:Z

    return-void
.end method

.method public setUplinkOnly(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/model/policy/LevelPolicyObject;->uplinkOnly:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    const-string v0, "LevelPolicyObject{handshake="

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ldev/epro/v2ray/model/policy/LevelPolicyObject;->handshake:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", connIdle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ldev/epro/v2ray/model/policy/LevelPolicyObject;->connIdle:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", uplinkOnly="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ldev/epro/v2ray/model/policy/LevelPolicyObject;->uplinkOnly:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", downlinkOnly="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ldev/epro/v2ray/model/policy/LevelPolicyObject;->downlinkOnly:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", statsUserUplink="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ldev/epro/v2ray/model/policy/LevelPolicyObject;->statsUserUplink:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", statsUserDownlink="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ldev/epro/v2ray/model/policy/LevelPolicyObject;->statsUserDownlink:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", bufferSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ldev/epro/v2ray/model/policy/LevelPolicyObject;->bufferSize:I

    const/16 v2, 0x7d

    invoke-static {v0, v1, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
