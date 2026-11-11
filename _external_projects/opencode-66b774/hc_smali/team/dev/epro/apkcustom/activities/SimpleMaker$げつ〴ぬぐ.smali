.class public Lteam/dev/epro/apkcustom/activities/SimpleMaker$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lteam/dev/epro/apkcustom/activities/SimpleMaker;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/activities/SimpleMaker;)V
    .registers 2

    iput-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .registers 5

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 1
    iget-object v0, p1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ごづごきえ:Landroid/widget/RadioGroup;

    .line 2
    invoke-virtual {v0, p2}, Landroid/widget/RadioGroup;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/RadioButton;

    .line 3
    iput-object p2, p1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ざっざへづ:Landroid/widget/RadioButton;

    .line 4
    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 5
    iget-object p2, p1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ごづごきえ:Landroid/widget/RadioGroup;

    .line 6
    iget-object p1, p1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->ざっざへづ:Landroid/widget/RadioButton;

    .line 7
    invoke-virtual {p2, p1}, Landroid/widget/RadioGroup;->indexOfChild(Landroid/view/View;)I

    move-result p1

    iget-object p2, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "IakAggLe=MegMbfN7oO6f\u0019jk\u001dki\u001bc:Lf9\u001e7kAfnHjm\u001dcjId<O6iAblOenA6:\u001aao\u0019"

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 8
    invoke-virtual {p2, v1, v0}, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->〺でおいここ(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p2, 0x1

    if-ne p1, p2, :cond_41

    .line 9
    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 10
    iget-object p1, p1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->せづっ〸ちね:Landroid/widget/CheckBox;

    .line 11
    invoke-virtual {p1, p2}, Landroid/widget/CheckBox;->setEnabled(Z)V

    goto :goto_50

    :cond_41
    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 12
    iget-object p1, p1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->せづっ〸ちね:Landroid/widget/CheckBox;

    const/4 p2, 0x0

    .line 13
    invoke-virtual {p1, p2}, Landroid/widget/CheckBox;->setEnabled(Z)V

    iget-object p1, p0, Lteam/dev/epro/apkcustom/activities/SimpleMaker$げつ〴ぬぐ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/activities/SimpleMaker;

    .line 14
    iget-object p1, p1, Lteam/dev/epro/apkcustom/activities/SimpleMaker;->せづっ〸ちね:Landroid/widget/CheckBox;

    .line 15
    invoke-virtual {p1, p2}, Landroid/widget/CheckBox;->setChecked(Z)V

    :goto_50
    return-void
.end method
