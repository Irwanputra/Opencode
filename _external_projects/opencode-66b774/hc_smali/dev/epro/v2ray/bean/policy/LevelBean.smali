.class public Ldev/epro/v2ray/bean/policy/LevelBean;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public connIdle:Ljava/lang/Integer;

.field public downlinkOnly:Ljava/lang/Integer;

.field public handshake:Ljava/lang/Integer;

.field public uplinkOnly:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getConnIdle()Ljava/lang/Integer;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/policy/LevelBean;->connIdle:Ljava/lang/Integer;

    return-object v0
.end method

.method public getDownlinkOnly()Ljava/lang/Integer;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/policy/LevelBean;->downlinkOnly:Ljava/lang/Integer;

    return-object v0
.end method

.method public getHandshake()Ljava/lang/Integer;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/policy/LevelBean;->handshake:Ljava/lang/Integer;

    return-object v0
.end method

.method public getUplinkOnly()Ljava/lang/Integer;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/policy/LevelBean;->uplinkOnly:Ljava/lang/Integer;

    return-object v0
.end method

.method public setConnIdle(Ljava/lang/Integer;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/policy/LevelBean;->connIdle:Ljava/lang/Integer;

    return-void
.end method

.method public setDownlinkOnly(Ljava/lang/Integer;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/policy/LevelBean;->downlinkOnly:Ljava/lang/Integer;

    return-void
.end method

.method public setHandshake(Ljava/lang/Integer;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/policy/LevelBean;->handshake:Ljava/lang/Integer;

    return-void
.end method

.method public setUplinkOnly(Ljava/lang/Integer;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/policy/LevelBean;->uplinkOnly:Ljava/lang/Integer;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    const-string v0, "LevelBean{handshake="

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/bean/policy/LevelBean;->handshake:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", connIdle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/bean/policy/LevelBean;->connIdle:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", uplinkOnly="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/bean/policy/LevelBean;->uplinkOnly:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", downlinkOnly="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/bean/policy/LevelBean;->downlinkOnly:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
