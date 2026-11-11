.class public Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/いいにぽつ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/いいにぽつ;->onAnimationEnd(Landroid/view/animation/Animation;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/いいにぽつ;


# direct methods
.method public constructor <init>(Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/いいにぽつ;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/いいにぽつ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/いいにぽつ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 8

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/いいにぽつ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/いいにぽつ;

    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/いいにぽつ;->〺つふすそ:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->ぁごぐすすぃ()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_22

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/いいにぽつ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/いいにぽつ;

    iget-object v0, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/いいにぽつ;->〺つふすそ:Landroidx/fragment/app/Fragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->〴ねぷぐくぼ(Landroid/view/View;)V

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/いいにぽつ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/いいにぽつ;

    iget-object v1, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/いいにぽつ;->くし〴〺ぅ:Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;

    iget-object v2, v0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/いいにぽつ;->〺つふすそ:Landroidx/fragment/app/Fragment;

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->〻ぞまぎな〻()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v1 .. v6}, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;->な〱ちぉじ(Landroidx/fragment/app/Fragment;IIIZ)V

    :cond_22
    return-void
.end method
