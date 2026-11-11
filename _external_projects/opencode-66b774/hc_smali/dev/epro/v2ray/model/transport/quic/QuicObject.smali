.class public Ldev/epro/v2ray/model/transport/quic/QuicObject;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public header:Ldev/epro/v2ray/model/transport/quic/HeaderObject;

.field public key:Ljava/lang/String;

.field public security:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getHeader()Ldev/epro/v2ray/model/transport/quic/HeaderObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/transport/quic/QuicObject;->header:Ldev/epro/v2ray/model/transport/quic/HeaderObject;

    return-object v0
.end method

.method public getKey()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/transport/quic/QuicObject;->key:Ljava/lang/String;

    return-object v0
.end method

.method public getSecurity()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/transport/quic/QuicObject;->security:Ljava/lang/String;

    return-object v0
.end method

.method public setHeader(Ldev/epro/v2ray/model/transport/quic/HeaderObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/transport/quic/QuicObject;->header:Ldev/epro/v2ray/model/transport/quic/HeaderObject;

    return-void
.end method

.method public setKey(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/transport/quic/QuicObject;->key:Ljava/lang/String;

    return-void
.end method

.method public setSecurity(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/transport/quic/QuicObject;->security:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    const-string v0, "QuicObject{security=\'"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/model/transport/quic/QuicObject;->security:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", key=\'"

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/model/transport/quic/QuicObject;->key:Ljava/lang/String;

    const-string v3, ", header="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/model/transport/quic/QuicObject;->header:Ldev/epro/v2ray/model/transport/quic/HeaderObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
