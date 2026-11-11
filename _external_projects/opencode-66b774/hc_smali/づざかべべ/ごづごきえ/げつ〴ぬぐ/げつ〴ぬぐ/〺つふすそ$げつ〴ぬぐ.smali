.class public Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/graphics/drawable/Drawable$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;


# direct methods
.method public constructor <init>(Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .registers 2

    iget-object p1, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V
    .registers 5

    iget-object p1, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    invoke-virtual {p1, p2, p3, p4}, Landroid/graphics/drawable/Drawable;->scheduleSelf(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V
    .registers 3

    iget-object p1, p0, Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/ごづごきえ/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ;

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->unscheduleSelf(Ljava/lang/Runnable;)V

    return-void
.end method
