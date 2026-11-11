.class public Ldev/epro/v2ray/bean/outbounds/stream/quic/QuicSettingBean;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public header:Ldev/epro/v2ray/bean/outbounds/stream/quic/HeaderBean;

.field public key:Ljava/lang/String;

.field public security:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "none"

    iput-object v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/quic/QuicSettingBean;->security:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/quic/QuicSettingBean;->key:Ljava/lang/String;

    new-instance v0, Ldev/epro/v2ray/bean/outbounds/stream/quic/HeaderBean;

    invoke-direct {v0}, Ldev/epro/v2ray/bean/outbounds/stream/quic/HeaderBean;-><init>()V

    iput-object v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/quic/QuicSettingBean;->header:Ldev/epro/v2ray/bean/outbounds/stream/quic/HeaderBean;

    return-void
.end method


# virtual methods
.method public getHeader()Ldev/epro/v2ray/bean/outbounds/stream/quic/HeaderBean;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/quic/QuicSettingBean;->header:Ldev/epro/v2ray/bean/outbounds/stream/quic/HeaderBean;

    return-object v0
.end method

.method public getKey()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/quic/QuicSettingBean;->key:Ljava/lang/String;

    return-object v0
.end method

.method public getSecurity()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/bean/outbounds/stream/quic/QuicSettingBean;->security:Ljava/lang/String;

    return-object v0
.end method

.method public setHeader(Ldev/epro/v2ray/bean/outbounds/stream/quic/HeaderBean;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/outbounds/stream/quic/QuicSettingBean;->header:Ldev/epro/v2ray/bean/outbounds/stream/quic/HeaderBean;

    return-void
.end method

.method public setKey(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/outbounds/stream/quic/QuicSettingBean;->key:Ljava/lang/String;

    return-void
.end method

.method public setSecurity(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/bean/outbounds/stream/quic/QuicSettingBean;->security:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    const-string v0, "QuicSettingBean{security=\'"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/bean/outbounds/stream/quic/QuicSettingBean;->security:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", key=\'"

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/bean/outbounds/stream/quic/QuicSettingBean;->key:Ljava/lang/String;

    const-string v3, ", header="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/bean/outbounds/stream/quic/QuicSettingBean;->header:Ldev/epro/v2ray/bean/outbounds/stream/quic/HeaderBean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
