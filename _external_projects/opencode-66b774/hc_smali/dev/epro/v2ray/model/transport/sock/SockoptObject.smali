.class public Ldev/epro/v2ray/model/transport/sock/SockoptObject;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public mark:I

.field public tcpFastOpen:Z

.field public tproxy:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getMark()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/model/transport/sock/SockoptObject;->mark:I

    return v0
.end method

.method public getTcpFastOpen()Z
    .registers 2

    iget-boolean v0, p0, Ldev/epro/v2ray/model/transport/sock/SockoptObject;->tcpFastOpen:Z

    return v0
.end method

.method public getTproxy()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/transport/sock/SockoptObject;->tproxy:Ljava/lang/String;

    return-object v0
.end method

.method public setMark(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/model/transport/sock/SockoptObject;->mark:I

    return-void
.end method

.method public setTcpFastOpen(Z)V
    .registers 2

    iput-boolean p1, p0, Ldev/epro/v2ray/model/transport/sock/SockoptObject;->tcpFastOpen:Z

    return-void
.end method

.method public setTproxy(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/transport/sock/SockoptObject;->tproxy:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    const-string v0, "SockoptObject{mark="

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ldev/epro/v2ray/model/transport/sock/SockoptObject;->mark:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", tcpFastOpen="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ldev/epro/v2ray/model/transport/sock/SockoptObject;->tcpFastOpen:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", tproxy=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/transport/sock/SockoptObject;->tproxy:Ljava/lang/String;

    const/16 v2, 0x27

    const/16 v3, 0x7d

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ(Ljava/lang/StringBuilder;Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
