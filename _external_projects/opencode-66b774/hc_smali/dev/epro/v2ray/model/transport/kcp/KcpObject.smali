.class public Ldev/epro/v2ray/model/transport/kcp/KcpObject;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public congestion:Z

.field public downlinkCapacity:I

.field public header:Ldev/epro/v2ray/model/transport/kcp/HeaderObject;

.field public mtu:I

.field public readBufferSize:I

.field public seed:Ljava/lang/String;

.field public tti:I

.field public uplinkCapacity:I

.field public writeBufferSize:I


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCongestion()Z
    .registers 2

    iget-boolean v0, p0, Ldev/epro/v2ray/model/transport/kcp/KcpObject;->congestion:Z

    return v0
.end method

.method public getDownlinkCapacity()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/model/transport/kcp/KcpObject;->downlinkCapacity:I

    return v0
.end method

.method public getHeader()Ldev/epro/v2ray/model/transport/kcp/HeaderObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/transport/kcp/KcpObject;->header:Ldev/epro/v2ray/model/transport/kcp/HeaderObject;

    return-object v0
.end method

.method public getMtu()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/model/transport/kcp/KcpObject;->mtu:I

    return v0
.end method

.method public getReadBufferSize()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/model/transport/kcp/KcpObject;->readBufferSize:I

    return v0
.end method

.method public getSeed()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/transport/kcp/KcpObject;->seed:Ljava/lang/String;

    return-object v0
.end method

.method public getTti()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/model/transport/kcp/KcpObject;->tti:I

    return v0
.end method

.method public getUplinkCapacity()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/model/transport/kcp/KcpObject;->uplinkCapacity:I

    return v0
.end method

.method public getWriteBufferSize()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/model/transport/kcp/KcpObject;->writeBufferSize:I

    return v0
.end method

.method public setCongestion(Z)V
    .registers 2

    iput-boolean p1, p0, Ldev/epro/v2ray/model/transport/kcp/KcpObject;->congestion:Z

    return-void
.end method

.method public setDownlinkCapacity(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/model/transport/kcp/KcpObject;->downlinkCapacity:I

    return-void
.end method

.method public setHeader(Ldev/epro/v2ray/model/transport/kcp/HeaderObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/transport/kcp/KcpObject;->header:Ldev/epro/v2ray/model/transport/kcp/HeaderObject;

    return-void
.end method

.method public setMtu(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/model/transport/kcp/KcpObject;->mtu:I

    return-void
.end method

.method public setReadBufferSize(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/model/transport/kcp/KcpObject;->readBufferSize:I

    return-void
.end method

.method public setSeed(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/transport/kcp/KcpObject;->seed:Ljava/lang/String;

    return-void
.end method

.method public setTti(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/model/transport/kcp/KcpObject;->tti:I

    return-void
.end method

.method public setUplinkCapacity(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/model/transport/kcp/KcpObject;->uplinkCapacity:I

    return-void
.end method

.method public setWriteBufferSize(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/model/transport/kcp/KcpObject;->writeBufferSize:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    const-string v0, "KcpObject{mtu="

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ldev/epro/v2ray/model/transport/kcp/KcpObject;->mtu:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", tti="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ldev/epro/v2ray/model/transport/kcp/KcpObject;->tti:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", uplinkCapacity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ldev/epro/v2ray/model/transport/kcp/KcpObject;->uplinkCapacity:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", downlinkCapacity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ldev/epro/v2ray/model/transport/kcp/KcpObject;->downlinkCapacity:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", congestion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ldev/epro/v2ray/model/transport/kcp/KcpObject;->congestion:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", readBufferSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ldev/epro/v2ray/model/transport/kcp/KcpObject;->readBufferSize:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", writeBufferSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ldev/epro/v2ray/model/transport/kcp/KcpObject;->writeBufferSize:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", header="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/transport/kcp/KcpObject;->header:Ldev/epro/v2ray/model/transport/kcp/HeaderObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", seed=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/transport/kcp/KcpObject;->seed:Ljava/lang/String;

    const/16 v2, 0x27

    const/16 v3, 0x7d

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ(Ljava/lang/StringBuilder;Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
