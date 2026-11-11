.class public Ldev/epro/v2ray/model/transport/tcp/TcpObject;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public acceptProxyProtocol:Z

.field public header:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAcceptProxyProtocol()Z
    .registers 2

    iget-boolean v0, p0, Ldev/epro/v2ray/model/transport/tcp/TcpObject;->acceptProxyProtocol:Z

    return v0
.end method

.method public getHeader()Ljava/lang/Object;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/transport/tcp/TcpObject;->header:Ljava/lang/Object;

    return-object v0
.end method

.method public setAcceptProxyProtocol(Z)V
    .registers 2

    iput-boolean p1, p0, Ldev/epro/v2ray/model/transport/tcp/TcpObject;->acceptProxyProtocol:Z

    return-void
.end method

.method public setHeader(Ljava/lang/Object;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/transport/tcp/TcpObject;->header:Ljava/lang/Object;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    const-string v0, "TcpObject{acceptProxyProtocol="

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Ldev/epro/v2ray/model/transport/tcp/TcpObject;->acceptProxyProtocol:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", header="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/transport/tcp/TcpObject;->header:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
