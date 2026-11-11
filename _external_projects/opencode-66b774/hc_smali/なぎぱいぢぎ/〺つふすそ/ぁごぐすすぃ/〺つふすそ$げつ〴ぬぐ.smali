.class public Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;->げつ〴ぬぐ(Ljava/lang/String;Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$〺つふすそ;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;)V
    .registers 2

    iput-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 7

    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;

    .line 1
    iget-object v0, v0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;->くし〴〺ぅ:Ljava/util/HashMap;

    .line 2
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$〺つふすそ;

    .line 3
    iget-object v2, v1, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$〺つふすそ;->びぐびあび:Ljava/util/LinkedList;

    .line 4
    invoke-virtual {v2}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1e
    :goto_1e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;

    .line 5
    iget-object v4, v3, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;->〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$づざかべべ;

    if-nez v4, :cond_2f

    goto :goto_1e

    .line 6
    :cond_2f
    iget-object v5, v1, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$〺つふすそ;->くし〴〺ぅ:Lなぎぱいぢぎ/〺つふすそ/びぐびあび/げつ〴ぬぐ;

    if-nez v5, :cond_3e

    .line 7
    iget-object v5, v1, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$〺つふすそ;->〺つふすそ:Landroid/graphics/Bitmap;

    .line 8
    iput-object v5, v3, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;->げつ〴ぬぐ:Landroid/graphics/Bitmap;

    const/4 v5, 0x0

    .line 9
    check-cast v4, Lcom/androidnetworking/widget/ANImageView$げつ〴ぬぐ;

    invoke-virtual {v4, v3, v5}, Lcom/androidnetworking/widget/ANImageView$げつ〴ぬぐ;->げつ〴ぬぐ(Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$びぐびあび;Z)V

    goto :goto_1e

    :cond_3e
    check-cast v4, Lcom/androidnetworking/widget/ANImageView$げつ〴ぬぐ;

    .line 10
    iget-object v3, v4, Lcom/androidnetworking/widget/ANImageView$げつ〴ぬぐ;->〺つふすそ:Lcom/androidnetworking/widget/ANImageView;

    .line 11
    iget v4, v3, Lcom/androidnetworking/widget/ANImageView;->なぎぱいぢぎ:I

    if-eqz v4, :cond_1e

    .line 12
    invoke-virtual {v3, v4}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    goto :goto_1e

    .line 13
    :cond_4a
    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;

    .line 14
    iget-object v0, v0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;->くし〴〺ぅ:Ljava/util/HashMap;

    .line 15
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;

    const/4 v1, 0x0

    .line 16
    iput-object v1, v0, Lなぎぱいぢぎ/〺つふすそ/ぁごぐすすぃ/〺つふすそ;->づざかべべ:Ljava/lang/Runnable;

    return-void
.end method
