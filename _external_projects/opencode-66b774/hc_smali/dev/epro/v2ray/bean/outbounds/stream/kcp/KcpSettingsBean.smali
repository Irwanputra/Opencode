.class public Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public congestion:Z

.field public downlinkCapacity:I

.field public header:Ldev/epro/v2ray/bean/outbounds/stream/kcp/HeaderBean;

.field public mtu:I

.field public readBufferSize:I

.field public tti:I

.field public uplinkCapacity:I

.field public writeBufferSize:I


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x546

    iput v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->mtu:I

    const/16 v0, 0x14

    iput v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->tti:I

    const/16 v0, 0xc

    iput v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->uplinkCapacity:I

    const/16 v0, 0x64

    iput v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->downlinkCapacity:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->congestion:Z

    const/4 v0, 0x1

    iput v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->readBufferSize:I

    iput v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->writeBufferSize:I

    new-instance v0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/HeaderBean;

    invoke-direct {v0}, Ldev/epro/v2ray/bean/outbounds/stream/kcp/HeaderBean;-><init>()V

    iput-object v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->header:Ldev/epro/v2ray/bean/outbounds/stream/kcp/HeaderBean;

    return-void
.end method


# virtual methods
.method public getDownlinkCapacity()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->downlinkCapacity:I

    return v0
.end method

.method public getHeader()Ldev/epro/v2ray/bean/outbounds/stream/kcp/HeaderBean;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->header:Ldev/epro/v2ray/bean/outbounds/stream/kcp/HeaderBean;

    return-object v0
.end method

.method public getMtu()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->mtu:I

    return v0
.end method

.method public getReadBufferSize()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->readBufferSize:I

    return v0
.end method

.method public getTti()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->tti:I

    return v0
.end method

.method public getUplinkCapacity()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->uplinkCapacity:I

    return v0
.end method

.method public getWriteBufferSize()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->writeBufferSize:I

    return v0
.end method

.method public isCongestion()Z
    .registers 2

    iget-boolean v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->congestion:Z

    return v0
.end method

.method public setCongestion(Z)V
    .registers 2

    iput-boolean p1, p0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->congestion:Z

    return-void
.end method

.method public setDownlinkCapacity(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->downlinkCapacity:I

    return-void
.end method

.method public setHeader(Ldev/epro/v2ray/bean/outbounds/stream/kcp/HeaderBean;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->header:Ldev/epro/v2ray/bean/outbounds/stream/kcp/HeaderBean;

    return-void
.end method

.method public setMtu(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->mtu:I

    return-void
.end method

.method public setReadBufferSize(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->readBufferSize:I

    return-void
.end method

.method public setTti(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->tti:I

    return-void
.end method

.method public setUplinkCapacity(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->uplinkCapacity:I

    return-void
.end method

.method public setWriteBufferSize(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->writeBufferSize:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    const-string v0, "KcpSettingsBean{mtu="

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->mtu:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", tti="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->tti:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", uplinkCapacity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->uplinkCapacity:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", downlinkCapacity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->downlinkCapacity:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", congestion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->congestion:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", readBufferSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->readBufferSize:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", writeBufferSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->writeBufferSize:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", header="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/bean/outbounds/stream/kcp/KcpSettingsBean;->header:Ldev/epro/v2ray/bean/outbounds/stream/kcp/HeaderBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
