.class public Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# instance fields
.field public 〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

.field public くし〴〺ぅ:Landroid/animation/AnimatorSet;

.field public げつ〴ぬぐ:I

.field public づざかべべ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u3065\u3056\u304b\u3079\u3079/\u3065\u3056\u304b\u3079\u3079/\u3052\u3064\u3034\u306c\u3050<",
            "Landroid/animation/Animator;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public びぐびあび:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/animation/Animator;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;Landroid/graphics/drawable/Drawable$Callback;Landroid/content/res/Resources;)V
    .registers 8

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    if-eqz p1, :cond_93

    iget v0, p1, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->げつ〴ぬぐ:I

    iput v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->げつ〴ぬぐ:I

    iget-object v0, p1, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    const/4 v1, 0x0

    if-eqz v0, :cond_38

    invoke-virtual {v0}, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v0

    if-eqz p3, :cond_19

    invoke-virtual {v0, p3}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    goto :goto_1d

    :cond_19
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p3

    :goto_1d
    check-cast p3, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    iput-object p3, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    invoke-virtual {p3}, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->mutate()Landroid/graphics/drawable/Drawable;

    iput-object p3, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    invoke-virtual {p3, p2}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    iget-object p2, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    iget-object p3, p1, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    iget-object p2, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    .line 1
    iput-boolean v1, p2, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->ぁごぐすすぃ:Z

    .line 2
    :cond_38
    iget-object p2, p1, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->びぐびあび:Ljava/util/ArrayList;

    if-eqz p2, :cond_93

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3, p2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p3, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->びぐびあび:Ljava/util/ArrayList;

    new-instance p3, Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-direct {p3, p2}, Lづざかべべ/づざかべべ/げつ〴ぬぐ;-><init>(I)V

    iput-object p3, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->づざかべべ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    :goto_4e
    if-ge v1, p2, :cond_81

    iget-object p3, p1, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->びぐびあび:Ljava/util/ArrayList;

    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/animation/Animator;

    invoke-virtual {p3}, Landroid/animation/Animator;->clone()Landroid/animation/Animator;

    move-result-object v0

    iget-object v2, p1, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->づざかべべ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    const/4 v3, 0x0

    .line 3
    invoke-virtual {v2, p3, v3}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    .line 4
    check-cast p3, Ljava/lang/String;

    iget-object v2, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;

    .line 5
    iget-object v2, v2, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ;->くし〴〺ぅ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ$〳ぜぞぜべっ;

    iget-object v2, v2, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ$〳ぜぞぜべっ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ$ぁごぐすすぃ;

    iget-object v2, v2, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/ぁごぐすすぃ$ぁごぐすすぃ;->ぇぬぎばつ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    .line 6
    invoke-virtual {v2, p3, v3}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 7
    invoke-virtual {v0, v2}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    iget-object v2, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->びぐびあび:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->づざかべべ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {v2, v0, p3}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_4e

    .line 8
    :cond_81
    iget-object p1, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->くし〴〺ぅ:Landroid/animation/AnimatorSet;

    if-nez p1, :cond_8c

    new-instance p1, Landroid/animation/AnimatorSet;

    invoke-direct {p1}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object p1, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->くし〴〺ぅ:Landroid/animation/AnimatorSet;

    :cond_8c
    iget-object p1, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->くし〴〺ぅ:Landroid/animation/AnimatorSet;

    iget-object p2, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->びぐびあび:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/animation/AnimatorSet;->playTogether(Ljava/util/Collection;)V

    :cond_93
    return-void
.end method


# virtual methods
.method public getChangingConfigurations()I
    .registers 2

    iget v0, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$〺つふすそ;->げつ〴ぬぐ:I

    return v0
.end method

.method public newDrawable()Landroid/graphics/drawable/Drawable;
    .registers 3

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No constant state support for SDK < 24."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .registers 3

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "No constant state support for SDK < 24."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
