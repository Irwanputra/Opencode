.class public Ldev/epro/v2ray/model/protocols/http/InboundConfigurationObject;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public accounts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ldev/epro/v2ray/model/protocols/http/AccountObject;",
            ">;"
        }
    .end annotation
.end field

.field public allowTransparent:Z

.field public timeout:I

.field public userLevel:I


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAccounts()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldev/epro/v2ray/model/protocols/http/AccountObject;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ldev/epro/v2ray/model/protocols/http/InboundConfigurationObject;->accounts:Ljava/util/List;

    return-object v0
.end method

.method public getAllowTransparent()Z
    .registers 2

    iget-boolean v0, p0, Ldev/epro/v2ray/model/protocols/http/InboundConfigurationObject;->allowTransparent:Z

    return v0
.end method

.method public getTimeout()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/model/protocols/http/InboundConfigurationObject;->timeout:I

    return v0
.end method

.method public getUserLevel()I
    .registers 2

    iget v0, p0, Ldev/epro/v2ray/model/protocols/http/InboundConfigurationObject;->userLevel:I

    return v0
.end method

.method public setAccounts(Ljava/util/List;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ldev/epro/v2ray/model/protocols/http/AccountObject;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldev/epro/v2ray/model/protocols/http/InboundConfigurationObject;->accounts:Ljava/util/List;

    return-void
.end method

.method public setAllowTransparent(Z)V
    .registers 2

    iput-boolean p1, p0, Ldev/epro/v2ray/model/protocols/http/InboundConfigurationObject;->allowTransparent:Z

    return-void
.end method

.method public setTimeout(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/model/protocols/http/InboundConfigurationObject;->timeout:I

    return-void
.end method

.method public setUserLevel(I)V
    .registers 2

    iput p1, p0, Ldev/epro/v2ray/model/protocols/http/InboundConfigurationObject;->userLevel:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 4

    const-string v0, "InboundConfigurationObject{timeout="

    invoke-static {v0}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->ぺぁあねじ(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ldev/epro/v2ray/model/protocols/http/InboundConfigurationObject;->timeout:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", accounts="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldev/epro/v2ray/model/protocols/http/InboundConfigurationObject;->accounts:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", allowTransparent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ldev/epro/v2ray/model/protocols/http/InboundConfigurationObject;->allowTransparent:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", userLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ldev/epro/v2ray/model/protocols/http/InboundConfigurationObject;->userLevel:I

    const/16 v2, 0x7d

    invoke-static {v0, v1, v2}, Lなぎぱいぢぎ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ/げつ〴ぬぐ;->びぐびあび(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
