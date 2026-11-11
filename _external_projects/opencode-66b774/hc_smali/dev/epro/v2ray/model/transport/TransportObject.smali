.class public Ldev/epro/v2ray/model/transport/TransportObject;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public dsSettings:Ldev/epro/v2ray/model/transport/ds/DomainSocketObject;

.field public httpSettings:Ldev/epro/v2ray/model/transport/http/HttpObject;

.field public kcpSettings:Ldev/epro/v2ray/model/transport/kcp/KcpObject;

.field public quicSettings:Ldev/epro/v2ray/model/transport/quic/QuicObject;

.field public tcpSettings:Ldev/epro/v2ray/model/transport/tcp/TcpObject;

.field public wsSettings:Ldev/epro/v2ray/model/transport/ws/WebSocketObject;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDsSettings()Ldev/epro/v2ray/model/transport/ds/DomainSocketObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/transport/TransportObject;->dsSettings:Ldev/epro/v2ray/model/transport/ds/DomainSocketObject;

    return-object v0
.end method

.method public getHttpSettings()Ldev/epro/v2ray/model/transport/http/HttpObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/transport/TransportObject;->httpSettings:Ldev/epro/v2ray/model/transport/http/HttpObject;

    return-object v0
.end method

.method public getKcpSettings()Ldev/epro/v2ray/model/transport/kcp/KcpObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/transport/TransportObject;->kcpSettings:Ldev/epro/v2ray/model/transport/kcp/KcpObject;

    return-object v0
.end method

.method public getQuicSettings()Ldev/epro/v2ray/model/transport/quic/QuicObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/transport/TransportObject;->quicSettings:Ldev/epro/v2ray/model/transport/quic/QuicObject;

    return-object v0
.end method

.method public getTcpSettings()Ldev/epro/v2ray/model/transport/tcp/TcpObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/transport/TransportObject;->tcpSettings:Ldev/epro/v2ray/model/transport/tcp/TcpObject;

    return-object v0
.end method

.method public getWsSettings()Ldev/epro/v2ray/model/transport/ws/WebSocketObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/transport/TransportObject;->wsSettings:Ldev/epro/v2ray/model/transport/ws/WebSocketObject;

    return-object v0
.end method

.method public setDsSettings(Ldev/epro/v2ray/model/transport/ds/DomainSocketObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/transport/TransportObject;->dsSettings:Ldev/epro/v2ray/model/transport/ds/DomainSocketObject;

    return-void
.end method

.method public setHttpSettings(Ldev/epro/v2ray/model/transport/http/HttpObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/transport/TransportObject;->httpSettings:Ldev/epro/v2ray/model/transport/http/HttpObject;

    return-void
.end method

.method public setKcpSettings(Ldev/epro/v2ray/model/transport/kcp/KcpObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/transport/TransportObject;->kcpSettings:Ldev/epro/v2ray/model/transport/kcp/KcpObject;

    return-void
.end method

.method public setQuicSettings(Ldev/epro/v2ray/model/transport/quic/QuicObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/transport/TransportObject;->quicSettings:Ldev/epro/v2ray/model/transport/quic/QuicObject;

    return-void
.end method

.method public setTcpSettings(Ldev/epro/v2ray/model/transport/tcp/TcpObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/transport/TransportObject;->tcpSettings:Ldev/epro/v2ray/model/transport/tcp/TcpObject;

    return-void
.end method

.method public setWsSettings(Ldev/epro/v2ray/model/transport/ws/WebSocketObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/transport/TransportObject;->wsSettings:Ldev/epro/v2ray/model/transport/ws/WebSocketObject;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    const-string v0, "TransportObject{tcpSettings="

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/model/transport/TransportObject;->tcpSettings:Ldev/epro/v2ray/model/transport/tcp/TcpObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", kcpSettings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/transport/TransportObject;->kcpSettings:Ldev/epro/v2ray/model/transport/kcp/KcpObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", wsSettings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/transport/TransportObject;->wsSettings:Ldev/epro/v2ray/model/transport/ws/WebSocketObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", httpSettings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/transport/TransportObject;->httpSettings:Ldev/epro/v2ray/model/transport/http/HttpObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", dsSettings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/transport/TransportObject;->dsSettings:Ldev/epro/v2ray/model/transport/ds/DomainSocketObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", quicSettings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/transport/TransportObject;->quicSettings:Ldev/epro/v2ray/model/transport/quic/QuicObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
