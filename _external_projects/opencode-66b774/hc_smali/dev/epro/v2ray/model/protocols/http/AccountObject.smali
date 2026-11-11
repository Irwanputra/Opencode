.class public Ldev/epro/v2ray/model/protocols/http/AccountObject;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public pass:Ljava/lang/String;

.field public user:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getPass()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/protocols/http/AccountObject;->pass:Ljava/lang/String;

    return-object v0
.end method

.method public getUser()Ljava/lang/String;
    .registers 2

    iget-object v0, p0, Ldev/epro/v2ray/model/protocols/http/AccountObject;->user:Ljava/lang/String;

    return-object v0
.end method

.method public setPass(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/protocols/http/AccountObject;->pass:Ljava/lang/String;

    return-void
.end method

.method public setUser(Ljava/lang/String;)V
    .registers 2

    iput-object p1, p0, Ldev/epro/v2ray/model/protocols/http/AccountObject;->user:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 5

    const-string v0, "AccountObject{user=\'"

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ldev/epro/v2ray/model/protocols/http/AccountObject;->user:Ljava/lang/String;

    const/16 v2, 0x27

    const-string v3, ", pass=\'"

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びえぁぜい(Ljava/lang/StringBuilder;Ljava/lang/String;CLjava/lang/String;)V

    iget-object v1, p0, Ldev/epro/v2ray/model/protocols/http/AccountObject;->pass:Ljava/lang/String;

    const/16 v3, 0x7d

    invoke-static {v0, v1, v2, v3}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->づざかべべ(Ljava/lang/StringBuilder;Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
