.class public Ldev/epro/v2ray/model/protocols/socks/ServerObject;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public address:Ljava/lang/String;

.field public port:I

.field public users:Ldev/epro/v2ray/model/protocols/socks/UserObject;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAddress()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/protocols/socks/ServerObject;->address:Ljava/lang/String;

    return-object v0
.end method

.method public getPort()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/model/protocols/socks/ServerObject;->port:I

    return v0
.end method

.method public getUsers()Ldev/epro/v2ray/model/protocols/socks/UserObject;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/protocols/socks/ServerObject;->users:Ldev/epro/v2ray/model/protocols/socks/UserObject;

    return-object v0
.end method

.method public setAddress(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/protocols/socks/ServerObject;->address:Ljava/lang/String;

    return-void
.end method

.method public setPort(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/model/protocols/socks/ServerObject;->port:I

    return-void
.end method

.method public setUsers(Ldev/epro/v2ray/model/protocols/socks/UserObject;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/protocols/socks/ServerObject;->users:Ldev/epro/v2ray/model/protocols/socks/UserObject;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    const-string v0, "ServerObject{address=\'"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/model/protocols/socks/ServerObject;->address:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", port="

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget v1, p0, Ldev/epro/v2ray/model/protocols/socks/ServerObject;->port:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", users="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/protocols/socks/ServerObject;->users:Ldev/epro/v2ray/model/protocols/socks/UserObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
